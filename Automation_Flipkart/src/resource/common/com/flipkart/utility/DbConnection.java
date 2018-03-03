package com.flipkart.utility;

import org.apache.log4j.Logger;

public class DbConnection {
	
	private String portNumber;
		private String ipAddrss;
		private String userId;
		private String password;
		
		public  Logger Logs= Logger.getLogger(DbConnection.class);
		
		public void connectToDatabase() {
			
			Logs.info("DB connection IP address is "+ipAddrss);
			Logs.info("DB connection userId is "+userId);
			Logs.info("DB connection password is "+password);
			Logs.info("DB connection portNumber is "+portNumber);
			
		}

}
