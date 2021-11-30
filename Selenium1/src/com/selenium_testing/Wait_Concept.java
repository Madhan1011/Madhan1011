package com.selenium_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Concept {
	public static void main(String[] args){

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement create = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		create.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		user.sendKeys("Madhankumar");
	
		WebElement surname = driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg ')])[1]"));
		surname.sendKeys("sekar");
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElements(surname));
	}
	
	
}
