package com.Home_taskj;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fill_Form {

public static void main(String[] args) throws AWTException, IOException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	WebElement s = driver.findElement(By.xpath("//input[@id='firstName']"));
	s.sendKeys("Madhan");
	WebElement s1 = driver.findElement(By.xpath("//input[@id='lastName']"));
	s1.sendKeys("kumar");
	WebElement s3 = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
	s3.sendKeys("greenstechnology@gmail.com");
	WebElement c = driver.findElement(By.xpath("//label[text()='Male']"));
	c.click();
	WebElement s4 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
	s4.sendKeys("9876547782");
	WebElement s5 = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
	s5.click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement s6 = driver.findElement(By.xpath("//select[contains(@class,datepicker__month)]"));
	
	Select sel=new Select(s6);
	sel.selectByValue("5");
	WebElement s7 = driver.findElement(By.xpath("//select[contains(@class,'datepicker__year')]"));
	Select sel1=new Select(s7);
	sel1.selectByVisibleText("1993");
	WebElement s8 = driver.findElement(By.xpath("(//div[contains(text(),'20')])[1]"));
	s8.click();
//	WebElement s9 = driver.findElement(By.xpath("//div[contains(@class,'value-container--is-')]"));
//	s9.sendKeys("To Fill the Registration Form");
//	WebElement s10 = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
//	s10.click();
	
	
	WebElement s11 = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
	s11.sendKeys("chennai,kudrathur");
	driver.findElement(By.xpath("//div[text()='Select State']")).click();
	Robot key=new Robot();
	 key.keyPress(KeyEvent.VK_DOWN);
     key.keyRelease(KeyEvent.VK_DOWN);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);
	driver.findElement(By.xpath("//div[text()='Select City']")).click();
	 key.keyPress(KeyEvent.VK_DOWN);
     key.keyRelease(KeyEvent.VK_DOWN);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		key.keyPress(KeyEvent.VK_ENTER);
	key.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		TakesScreenshot b=(TakesScreenshot)driver;
	    File source = b.getScreenshotAs(OutputType.FILE);
	    File des=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Screenshot\\File.png");
	    FileUtils.copyFile(source, des);
//			
//	
	
	
	
	
	
}






















}
