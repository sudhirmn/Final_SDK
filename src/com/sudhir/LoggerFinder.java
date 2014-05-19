package com.sudhir;


public class LoggerFinder {

	static{
		
			System.out.println("First here");
			Package objPackage = org.apache.log4j.Logger.class.getPackage();
			
			System.out.println("Logging vendor"+objPackage.getImplementationVendor());
			System.out.println("Logging version"+objPackage.getSpecificationVersion());
			
			Package objPackage1 = java.util.logging.Logger.class.getPackage();
			
			
			System.out.println("Logging vendor"+objPackage1.getImplementationVendor());
			System.out.println("Logging version"+objPackage1.getSpecificationVersion());
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("then here");
	}

}
