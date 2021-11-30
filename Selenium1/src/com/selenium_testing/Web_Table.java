package com.selenium_testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Web_Table {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	Actions act=new Actions(driver);
	driver.get("https://www.nyse.com/ipo-center/filings");
	WebElement movetoelement = driver.findElement(By.xpath("//h2[text()='Filed Deals']"));
	act.moveToElement(movetoelement).perform();;
	System.out.println(movetoelement.getText());
	
	List<WebElement> row1 = driver.findElements(By.xpath("//table[3]//tbody//tr[1]"));
	for (WebElement webElement : row1) {
System.out.println(webElement.getText());
	}
WebElement element = driver.findElement(By.xpath("//table[3]//tbody//tr[1]//td[5]"));
	System.out.println(element.getText());
	for (int i = 1; i <=8; i++) {
		for (int j = 1; j <=9; j++) {
			WebElement element2 = driver.findElement(By.xpath("//table[3]//tbody//tr[" + i + "]//td[" + j + "]"));
			System.out.print(element2.getText()+ "   ");
			
			}
		System.out.println();
	}
	
	List<WebElement> head = driver.findElements(By.xpath("//table[3]//thead//tr"));
	for (WebElement webElement : head) {
		System.out.println(webElement.getText());
	}
	
	
	}
	
	
}
	
	
	

