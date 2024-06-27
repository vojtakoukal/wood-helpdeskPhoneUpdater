package com.soitron.HelpDeskPhoneUpdater;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Read configuration parameters from properties file
 * @author vojta
 *
 */
public class Configuration {

	private static Logger logger = LoggerFactory.getLogger(Configuration.class);
	
	public static String getProp(String name) throws IOException {

		 Properties prop = new Properties(); 	     
	     String sep = File.separator;
	     String fileName = "C:\\Program Files\\HelpDeskPhoneUpdater\\configuration.properties";
//	     fileName = "/home/vojta/configuration.properties";
	     FileInputStream fis = null;

	     try {
			fis = new FileInputStream(fileName);
			prop.load(fis);			
		} catch (IOException e) {
			logger.error("Configuration:getProp() -> unable to read properties file.");
			e.printStackTrace();
			throw new IOException("Unable to read properties file.");
		} finally {
			try {
				fis.close();				
			} catch (IOException e) {
				logger.error("Configuration:getProp() -> unable to close properties file.");	
				e.printStackTrace();
			}
		}
	     	    
	     return prop.getProperty(name).trim();
	}
	
}
