package com.sudhir;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;



/**
 * Test Class to verify Log4J formatter
 * @author sunagara
 *
 */
public class TestLog4jFormatter {

	
	  private static Logger logger = Logger.getLogger("TestLog4jFormatter");
	 static{
		 
		 logger.setLevel(Level.INFO);
		 
	 }
	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		logger.info("Message to test Log4j Fomatter\r\nchecking");
		
	}
}
