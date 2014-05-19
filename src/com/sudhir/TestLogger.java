package com.sudhir;

import java.net.URL;

import org.apache.log4j.Logger;

import com.cybersource.CyberSourceDailyRollingFileAppender;
import com.cybersource.LogSanitizer;
public class TestLogger {
	
	static Logger log = Logger.getLogger(
			TestLogger.class.getName());
	
	
	public static void main(String[] args) {
		
		     CyberSourceDailyRollingFileAppender csdf = new CyberSourceDailyRollingFileAppender();
		     
		     log.debug(null);
		     
		     
		     log.debug("hello");
		     log.info("dfdfd");
		     System.out.println("This LogSanitizer test");
		     System.out.println(LogSanitizer.sanitizeCRLF("\n\rfgfgdfgfd\r"));
		     String str1 = null;
		     System.out.println("Check 1"+LogSanitizer.sanitize(null));
		     System.out.println("check 3"+LogSanitizer.sanitize(str1, true));
		     System.out.println("check 3"+LogSanitizer.sanitize("", true));
		     
		     Class clazz = null;
		 	try {
		 		clazz = Class.forName( LogSanitizer.class.getName() );
		 		if ( clazz != null && clazz.getProtectionDomain() != null
		 		        && clazz.getProtectionDomain().getCodeSource() != null )
		 		{
		 			URL codeLocation = clazz.getProtectionDomain().getCodeSource()
		 			        .getLocation();
		 			System.out.println( codeLocation.toString() );
		 			System.out.println("clazz.getClassLoader();"+clazz.getClassLoader());
		 			System.out.println("Cjedf"+clazz.getProtectionDomain().getCodeSource());
		 			
		 			Package objPackage = org.apache.log4j.Logger.class.getPackage();
		 			
		 			System.out.println("Logging vendor"+objPackage.getImplementationVendor());
		 			System.out.println("Logging version"+objPackage.getSpecificationVersion());
		 			System.out.println("Logging Title"+objPackage.getSpecificationTitle());
		 			Package objPackage1 = java.util.logging.Logger.class.getPackage();
		 			
		 			
		 			System.out.println("Logging vendor"+objPackage1.getImplementationVendor());
		 			System.out.println("Logging version"+objPackage1.getSpecificationVersion());
		 			System.out.println("Logging Title"+objPackage1.getSpecificationTitle());
		 			
		 		}
		 	}
		 	catch ( ClassNotFoundException e ) {
		 		System.out.println( e.getMessage() );
		 	}
	}
}