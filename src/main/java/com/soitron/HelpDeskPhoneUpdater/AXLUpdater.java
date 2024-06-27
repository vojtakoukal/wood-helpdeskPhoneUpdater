package com.soitron.HelpDeskPhoneUpdater;

import javax.xml.bind.JAXBElement;
import javax.xml.ws.BindingProvider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cisco.axl.api._11.GetLineReq;
import com.cisco.axl.api._11.GetLineRes;
import com.cisco.axl.api._11.ObjectFactory;
import com.cisco.axl.api._11.UpdateLineReq;
import com.cisco.axl.api._11.XCallForwardAll;
import com.cisco.axlapiservice.AXLAPIService;
import com.cisco.axlapiservice.AXLError;
import com.cisco.axlapiservice.AXLPort;

/**
 * 
 * @author soitron s.r.o.
 *
 */
public class AXLUpdater {
	private static Logger logger = LoggerFactory.getLogger(App.class);

	
	/**
	 * Nastavi presmerovani na dane lince (identifikovana pres UUID)
	 * @param destination - kam se ma presmerovat
	 * @param CUCMIP - IP CUCM
	 * @param username - AXL user
	 * @param password - AXL password
	 * @param LineUUID - UUID linky, ktera se ma presmerovat
	 * @return aktualni nastaveni forwardu (po zmene)
	 * @throws AXLError
	 * @author soitron s.r.o.
	 */
	public static String updateDNForward(String destination, String CUCMIP, String username, String password, String LineUUID) throws AXLError {  	
    	logger.info("updateDNForward - starting to update DN UUID " + LineUUID + " with CFALL to " + destination);
		
    	AXLAPIService axlService = new AXLAPIService();   
    	AXLPort axlPort = axlService.getAXLPort();

    	// Set the URL, user, and password on the JAX-WS client
    	String validatorUrl = "https://"
    	    + CUCMIP
    	    + ":8443/axl/";


    	((BindingProvider) axlPort).getRequestContext().put(
    	    BindingProvider.ENDPOINT_ADDRESS_PROPERTY, validatorUrl);
    	((BindingProvider) axlPort).getRequestContext().put(
    	    BindingProvider.USERNAME_PROPERTY, username);
    	((BindingProvider) axlPort).getRequestContext().put(
    	    BindingProvider.PASSWORD_PROPERTY, password);

    	
    	UpdateLineReq req = new UpdateLineReq();
    	req.setUuid(LineUUID);
    	
    	XCallForwardAll fwd = new XCallForwardAll();
    	ObjectFactory factory = new ObjectFactory();    	
       	JAXBElement<String> dest =  factory.createXCallForwardAllDestination(destination);       	
       	fwd.setDestination(dest);
    	req.setCallForwardAll(fwd);
       	
    	try {
    		axlPort.updateLine(req);
    	} catch(Exception e) {
    		logger.error("Error in updating CUCM line - " + e.getMessage());    		
    		logger.error("Terminating application...");
    		
    		System.exit(-1);
    	}
    	
    	GetLineReq r = new GetLineReq();
    	r.setUuid(LineUUID);
    	GetLineRes res = axlPort.getLine(r);
    	String actual = res.getReturn().getLine().getCallForwardAll().getDestination();
    	String DN = res.getReturn().getLine().getPattern();    	
    	
    	logger.info("updateDNForward - finished, actual CFALL configuration for DN "+ DN +": " + actual);
    	
    	return actual;
    }
	
}
