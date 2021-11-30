package com.selenium_testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.holdsLock(1000);
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions act=new Actions(driver);
		act.contextClick(mobile).perform();
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		WebElement Electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		act.contextClick(Electronics).perform();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement Computers = driver.findElement(By.xpath("//a[text()='Computers']"));
	
		act.contextClick(Computers).perform();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		Thread.sleep(1000);
		Set<String> sum = driver.getWindowHandles();
		for (String string : sum) {
			String title = driver.switchTo().window(string).getTitle();
		System.out.println(title);
		
		}
		
		Thread.sleep(1000);
		String Mob="Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		for (String string : sum) {
			if (driver.switchTo().window(string).getTitle().equalsIgnoreCase(Mob)) {
				System.out.println("Done");
			break;
			
			}
		}
		
		
		
		
		
		
}
}