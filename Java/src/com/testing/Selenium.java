package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe" );
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com");
	
	
	
	
}





}



