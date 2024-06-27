package com.soitron.HelpDeskPhoneUpdater;

import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.azure.identity.ClientSecretCredential;
import com.azure.identity.ClientSecretCredentialBuilder;
import com.microsoft.graph.authentication.TokenCredentialAuthProvider;
import com.microsoft.graph.models.Event;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.requests.GraphServiceClient;

/**
 * 
 * @author soitron s.r.o.
 *
 */
public class CalendarExtractor {

	private static Logger logger = LoggerFactory.getLogger(App.class);

	/**
	 * Pripoji se do Office365 a stahne vsechny aktualni eventy z kalendare
	 * Najde eventy, ktere aktualne probihaji a vytahne z nich kategorie
	 * Pokud je tam Event, ktery ma kategorii ve tvaru "neco neco #tel.cislo#" tak ziska tel.cislo a vrati ho 
	 * @return
	 * @throws Exception 
	 */
	public static String extractPhoneNumber() throws Exception {
    	
    	final ClientSecretCredential clientSecretCredential = new ClientSecretCredentialBuilder()
    	        .clientId(Configuration.getProp("AZURE_CLIENTID"))
    	        .clientSecret(Configuration.getProp("AZURE_CLIENTSECRET"))
    	        .tenantId(Configuration.getProp("AZURE_TENANTID"))
    	        .build();

    	List<String> scopes = new ArrayList<>();
    	scopes.add("https://graph.microsoft.com/.default");
    	final TokenCredentialAuthProvider tokenCredentialAuthProvider = new TokenCredentialAuthProvider(scopes, clientSecretCredential);

    	final GraphServiceClient graphClient =
    	  GraphServiceClient
    	    .builder()
    	    .authenticationProvider(tokenCredentialAuthProvider)
    	    .buildClient();
    	
    	//najdi vsechny eventy v kalendari ktere aktualne probihaji
	    String now = Instant.now().toString();
    	
	    List<Event> e = null;
	    try {
	    	logger.debug("Looking for calendar events with this filter: " + "start/dateTime le '"+ now +"' and end/dateTime ge '"+ now +"'");
	    	
	    	LinkedList<Option> requestOptions = new LinkedList<Option>();
	    	requestOptions.add(new QueryOption("startDateTime", now));
	    	requestOptions.add(new QueryOption("endDateTime", now));
	    	
	    	e = graphClient
	    			.users(Configuration.getProp("CALENDAR"))
	    			.calendar()
	    			.calendarView()
	    			.buildRequest(requestOptions)	    			
	    			.get()
	    			.getCurrentPage();
	    	
	    } catch(Exception ex) {
	    	logger.error("Oops, error in getting calendar data, ending application - " + ex.getMessage());
	    	ex.printStackTrace();
	    	System.exit(-1);
	    } 	    
	    
	    logger.debug("Received " + e.size() + " events from calendar. Processing them now...");
    	    	
	    
    	//projdi eventy a hledej ty, ktere maji categorii a v te categorii maji telefonni cislo mezi #
	    //idealni Category vypada takto: 'Javorsky #733625242#'
    	for (Event x : e) {
    		logger.debug("	Processing event with subject '" + x.subject + "' and categories: " + x.categories.toString());
    		if (x.categories.isEmpty()) {
    			logger.debug("		Event with subject '" + x.subject + "' does not have any categories, skipping.");
    			continue;
    		}
    		
    		//mame event s alespon jednou kategorii - projdeme a hledame telefonni cislo mezi #
    		for (String cat : x.categories) {
    			if (StringUtils.countMatches(cat, "#") == 2) {
    				
    				//mame kategorii, kde jsou dva #, takze vezmeme co je mezi nimi
    				String phone = cat.substring(StringUtils.indexOf(cat, "#") + 1, StringUtils.lastIndexOf(cat, "#"));
    				if (!StringUtils.isNumeric(phone)) {
    					//neni to cislo, preskocime
    					logger.debug("		Found category with two #, but there is no number in between them, skipping.");
    					continue;
    				}
    				
    				//mame kategorii a telefonni cislo, ktere je numericke
    				//predradime 0 pokud tam jiz neni
    				if (!phone.startsWith("0")) {    					
    					phone = "0" + phone;
    				}
    				
    				//mame finalni cislo kam presmerovat - volame AXL
    				logger.info("		Found correct phone number (after transformation) - " + phone + ", using this one to set the forward rule.");    				
    				return phone;
    			}
    		}
    		
    	}
    	
    	logger.info("No current event with correct category found, returning null.");
    	return null;
    	
    	
	}
	
}
