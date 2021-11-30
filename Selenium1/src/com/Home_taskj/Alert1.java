package com.Home_taskj;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/");
		driver.manage().window().maximize();
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement enter = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		enter.click();
		driver.switchTo().alert().accept();



}
}