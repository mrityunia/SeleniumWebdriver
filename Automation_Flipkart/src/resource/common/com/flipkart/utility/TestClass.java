package com.flipkart.utility;



public class TestClass {

	public static void main(String[] args){
		
		SConfiguration sc = new SConfiguration();
		
		SConfiguration.intilizeProjectConfigProprty();
		
		
		System.out.println("1" +sc.Chrome_browser);
		System.out.println("2"+sc.FF_browse);
		System.out.println("3"+sc.reportLocation);
		System.out.println("4"+sc.testCaesSheetLocation);
		System.out.println("5"+sc.logerLocation);
		System.out.println("6"+sc.ScreenShots);

	}

}
