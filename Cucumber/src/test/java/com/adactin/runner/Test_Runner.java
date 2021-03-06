package com.adactin.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base_Class.Base_Class2;
import com.adactin.helper.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature\\adactin.feature",
glue ="com.adactin.stepdefinition",monochrome = true,dryRun = false,strict = true,tags = ("~@regression"),
plugin = {"html:Report/Adactin_New",
		"pretty",
		"json:Report/Cucumber.json"
		
		
		
}
		
		
		)
public class Test_Runner {
public static WebDriver driver;   //null driver

@BeforeClass
public static void Set_up() throws Throwable {
	
	File_Reader_Manager.getInstance().getInstanceCR().getbrowser();
  driver=Base_Class2.browserLaunch();
  
}

@AfterClass
public static void tear_Down() throws InterruptedException {
	Thread.sleep(3000);
	driver.close();

}
	
	
	
	
}
