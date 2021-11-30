package com.selenium_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScript_Executer {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
    JavascriptExecutor js=(JavascriptExecutor) driver;
	//click
	js.executeScript("arguments[0].click();", mobile);
//	//scroll down
	js.executeScript("window.scrollBy(0,8000);");
//	//scroll down
	js.executeScript("window.scrollBy(0,-5000)");
//	WebDriverWait wait=new WebDriverWait(driver,30);
    WebElement element = driver.findElement(By.xpath("//h2[text()='Latest launches in smartphones']"));
//	wait.until(ExpectedConditions.visibilityOf(element));
//	//Scroll InToview
//	js.executeScript("arguments[0].scrollintoview();",element );
//	//get text
	String text = js.executeScript("return arguments[0].innerHTML", element).toString();
//	
	System.out.println(text);
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
















}
