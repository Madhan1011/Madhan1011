package com.Home_taskj;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Snapdeal_Order {

	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[contains(@placeholder,'Search products & brands')]"));
		search.sendKeys("iphones 7");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement s1 = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		s1.click();
//		WebElement s11 = driver.findElement(By.xpath("//input[@placeholder='Enter your pincode']"));
//		s11.sendKeys("600044");	
//		WebElement s12 = driver.findElement(By.xpath("//button[text()='Check']"));
//		s12.click();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement s4 = driver.findElement(By.xpath("(//span[@class='lfloat product-desc-price strike ']//ancestor::div)[7]"));
		s4.click();
      
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> i= handle.iterator();
		String wind = i.next();
		String mob = i.next();
		String title = driver.switchTo().window(mob).getTitle();
		System.out.println(title);
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	WebElement s5 = driver.findElement(By.xpath("//span[text()='add to cart']"));
		s5.click();
		WebElement s6 = driver.findElement(By.xpath("//div[@class='you-pay']"));
		System.out.println(s6.getText());
		TakesScreenshot shot=(TakesScreenshot)driver;
		File source = shot.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Screenshot\\cart.png");
		FileUtils.copyFile(source, des);
		
		
		
	
	}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

