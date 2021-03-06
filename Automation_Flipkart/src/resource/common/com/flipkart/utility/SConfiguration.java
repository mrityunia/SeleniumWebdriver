package com.flipkart.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class SConfiguration {
	
	
	public static String IE_browse;
	public static String FF_browse;
	public static String Chrome_browser;
	public static String reportLocation;
	public static String testCaesSheetLocation;
	public static String ScreenShots;
	public static String logerLocation;
    private static Properties prop;
    public static Logger logs= Logger.getLogger(SConfiguration.class);
    
	
    SConfiguration() {
    	
    	
    	try {
    		prop = new Properties();
    		prop.load(new FileInputStream(System.getProperty("user.dir").concat("\\src\\resource\\reports\\configurationFile.properties")));
		} catch (FileNotFoundException e) {
		
			logs.info("Propery file is not found "+e.getMessage());
			
			e.printStackTrace();
		} catch (IOException e) {
			
			logs.error("SOme error occured at     SConfiguration constructer"+e.getMessage());
		}
    }
    
    
    public static void intilizeProjectConfigProprty () {
		try {
			
			logs.info("Inserting into intilizeProjectConfigProprty methods");
		logs.info("your Configuration file is loaded successfully");
		
		Chrome_browser=prop.getProperty("chrome_driver");
		IE_browse=prop.getProperty("iE_Driver");
		FF_browse=prop.getProperty("fireFox");
		testCaesSheetLocation=prop.getProperty("testCaseSheet");
		reportLocation=prop.getProperty("report_location");
		ScreenShots=prop.getProperty("ScreenShotsStorageLocation");
		logerLocation=prop.getProperty("log4j.appender.HTML.File");
		
		logs.info("your Configuration file is read successfully");
		
		deleteOldReportFile();
		
		} catch (Exception e) {
			logs.error("Some error occured at  SConfiguration.class " +e.getMessage());
			
		}
		
		logs.info("Existing into intilizeProjectConfigProprty methods");
	}
	
	public static void deleteOldReportFile() {
		
		logs.info("Entering into deleteOldReportFile methods");
	try {
		
		File f= new File(prop.getProperty(logerLocation));
		
		if(f.delete())
		{
			logs.info("Your older logger file is deleted ");
		}	
		else{
			logs.info("Not able to delet older logger file");
		}
	}
	catch(Exception e) {
		logs.error("Some error occured at deleteOldReportFile()"+e.getMessage());
		
	}
	
	logs.info("Existing from deleteOldReportFile()");
	}
	
	
}
