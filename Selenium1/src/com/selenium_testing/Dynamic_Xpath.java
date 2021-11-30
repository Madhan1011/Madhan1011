package com.selenium_testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("https://www.myntra.com/men-tshirts");
//		driver.manage().window().maximize();
//		WebElement price = driver.findElement(By.xpath("(//span[@class='product-strike']//ancestor::div)[9]"));
//price.click();
//System.out.println(price.getText());
driver.get("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&as-pos=1&as-type=TRENDING&suggestionId=mobiles&requestId=bb5ac835-84e4-46b0-988b-b409048a5e97");
driver.findElement(By.xpath("(//span[text()='Add to Compare']//ancestor::div)[6]")).click();


//	for (int i = 0; i < price.size(); i++) {
//		String text = price.get(i).getText();
//		System.out.println(text);
//	}
	

}
}