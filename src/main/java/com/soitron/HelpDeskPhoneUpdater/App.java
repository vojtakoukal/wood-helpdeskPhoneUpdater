package com.soitron.HelpDeskPhoneUpdater;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.time.Instant;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cisco.axlapiservice.AXLError;



/**
 * Aplikace je pouzita na nacteni eventu z kalendare v O365, 
 * zjisteni kdo ma aktualne sluzbu (jestli nekdo) a nastaveni forwardu pevne linky v CUCM na mobilni cislo z kalendare
 * @author soitron s.r.o.
 *
 */
public class App {
	private static Logger logger = LoggerFactory.getLogger(App.class);
	

    public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();	

		logger.info("");
    	logger.info("-------------------------------------------------------------");
    	logger.info("Starting application in UTC time: " + Instant.now().toString());

    	//standard input - test
//    	logger.debug("Passed parameters: " + Arrays.toString(args));
//    	if (args.length != 4) {
//    		logger.error("Wrong parameter count supplied. Expecting 4 parameters -> CUCMIP username password lineUUID");
//    		System.out.println("Wrong parameter count supplied. Expecting 4 parameters -> CUCMIP username password lineUUID");
//    		System.exit(-1);    		
//    	}
//    	
    	final String CUCMIP = Configuration.getProp("CUCM_IP");
    	final String username = Configuration.getProp("AXL_username");
    	final String pass = Configuration.getProp("AXL_password");
    	final String lineUUID = Configuration.getProp("line_UUID");    	
    	
    	//ziskame telefoni cislo kam presmerovat
    	String phone = null;
		try {
			phone = CalendarExtractor.extractPhoneNumber();
		} catch (Exception e) {
			logger.error("Error in extracting data from calendar, ending application");
			logger.error(e.getMessage());
			e.printStackTrace();
			System.exit(-1);			
		}
		
		
		try {
	    	//provedeme samotne presmerovani
	    	if (phone == null) {
	    		//nenasli jsme zadny event s telefonnim cislem -> zrusit presmerovani na lince	    		
				AXLUpdater.updateDNForward("", CUCMIP, username, pass, lineUUID);					    	
	    	} else {
	    		//nasli jsme event s telefonnim cislem -> nastavit presmerovani na ten nalezeny telefon    		
	    		AXLUpdater.updateDNForward(phone, CUCMIP, username, pass, lineUUID);
	    	}
		} catch (AXLError e) {
			logger.error("Error in setting the forward in CUCM");
			logger.error(e.getMessage());
			e.printStackTrace();
		}
	    	
    	long end = System.currentTimeMillis();
		long elapsedTime = end - start;
    	logger.info("------------ FINISHED in "+ elapsedTime +" ms  ------------");
    }
   
    
    
    
    
    
    
    //povoleni veskere SSL komunikace, ignoruj certifikaty
    static {
        disableSslVerification();
    }

    private static void disableSslVerification() {
        try
        {
            // Create a trust manager that does not validate certificate chains
            TrustManager[] trustAllCerts = new TrustManager[] {new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                }
                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                }
            }
            };

            // Install the all-trusting trust manager
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

            // Create all-trusting host name verifier
            HostnameVerifier allHostsValid = new HostnameVerifier() {
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            };

            // Install the all-trusting host verifier
            HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
    }
 
 

}