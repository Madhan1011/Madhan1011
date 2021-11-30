package com.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {

	public WebDriver driver;
	@BeforeSuite
	public void browser_launch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Test_Ng\\Driver\\chromedriver.exe");

	driver=new ChromeDriver();
	}
	@BeforeTest
	public void open_Url() {
		driver.get("https://www.amazon.in/");
}
	
	@BeforeMethod
	public void beforeee() {
		System.out.println("before");

	}
	
	@Test
	public void testt() {
		System.out.println("Done");

	}
	
	@Test
	public void testt1() {
	System.out.println("Success");

	}
	@AfterMethod
	public void aftrrr() {
		System.out.println("After");
	}
	@AfterTest
	public void close() {
		System.out.println("Close");

	}
	
}
