package com.Home_taskj;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShot {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement contact = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		Actions act=new Actions(driver);
		act.contextClick(contact).perform();
        Robot key=new Robot();
        key.keyPress(KeyEvent.VK_DOWN);
        key.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		Set<String> s = driver.getWindowHandles();
		Iterator<String> a = s.iterator();
		String green = a.next();
		String course = a.next();
		String title = driver.switchTo().window(course).getTitle();
		System.out.println(title);
	Thread.sleep(1000);
	WebElement c = driver.findElement(By.xpath("//a[text()='Courses ']"));
	c.click();
	WebElement d = driver.findElement(By.xpath("(//img[contains(@class,'img-fluid')])[21]"));
	d.click();
	Thread.sleep(1000);
    TakesScreenshot b=(TakesScreenshot)driver;
    File source = b.getScreenshotAs(OutputType.FILE);
    File des=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Screenshot\\oracle.png");
    FileUtils.copyFile(source, des);
		
	}

}

