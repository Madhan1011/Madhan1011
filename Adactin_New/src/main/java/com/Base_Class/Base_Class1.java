package com.Base_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class1 {
	public static WebDriver driver;
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Adactin_New\\Driver\\chromedriver.exe");

		driver=new ChromeDriver();

	}
	public static void openUrl(String url) {
		driver.get(url);

	}
	public static void close() {
		driver.close();

	}
	public static void quit() {
		driver.quit();

	}
	public static void navigateTo(String url1) {
		driver.navigate().to(url1);

	}

	public static void navigateBack() {
		driver.navigate().back();

	}

	public static void navigateForward() {
		driver.navigate().forward();

	}

	public static void navigateRefresh() {
		driver.navigate().refresh();

	}
	public static void alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
	public static void alertDismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	public static void inputValues(WebElement a,String b) {
		a.sendKeys(b);	
	}
	public static void actionClick(WebElement element) {
		Actions ac=new Actions(driver);
		ac.click(element).perform();;
	}
	public static void contextClick(WebElement element) {
		Actions ac=new Actions(driver);
		ac.contextClick(element).perform();;
	}
	public static void doubleClick(WebElement element) {
		Actions ac=new Actions(driver);
		ac.doubleClick(element).perform();;
	}
	public static void moveToElement(WebElement element) {
		Actions ac=new Actions(driver);
		ac.moveToElement(element).perform();;
	}

	public static void dragAndDrop(WebElement from,WebElement to) {
		Actions ac=new Actions(driver);
		ac.dragAndDrop(from, to).perform();
	}
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	public static void frames(WebElement element) {
		driver.switchTo().frame(element);
	}
	public static void robot() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void windowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
		}
	}
	public static void dropDown1(WebElement element,String str) {
		Select s=new Select(element);
		s.selectByValue(str);	
	}

	public static void dropDown2(WebElement element,int str) {
		Select s=new Select(element);
		s.selectByIndex(str);
	}
	public static void dropDown3(WebElement element,String str) {
		Select s=new Select(element);
		s.selectByVisibleText(str);
	}
	public static void isMultiple(WebElement element) {
		Select s=new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}
	public static void getOptions(WebElement element) {
		Select ss=new Select(element);	
		List<WebElement> options = ss.getOptions();   
		for (WebElement webElement : options) {
			String text = webElement.getText();
			System.out.println(text);
		}
	}
	public static void getFirstSelected(WebElement element) {
		Select ss=new Select(element);
		ss.getFirstSelectedOption();
	}
	public static void getAllSelected(WebElement element) {
		Select ss=new Select(element);
		ss.getAllSelectedOptions();
	}
	public static void checkBox(WebElement element) {
		element.click();	
	}
	public static void isEnable(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}
	public static void isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}
	public static void isSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	public static void getText(WebElement element) {
		String text = element.getText();	
		System.out.println(text);
	}
	public static void getAttribute(WebElement element,String str) {
String attribute = element.getAttribute(str);
System.out.println(attribute);
}
	public static void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	public static void explicitlyWait(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

public static void takesCreenshot(String path) throws IOException {
  TakesScreenshot shot=(TakesScreenshot) driver;
File from = shot.getScreenshotAs(OutputType.FILE);
File to=new File(path);
FileUtils.copyFile(from, to);
}

public static void ScrollDown() {
	JavascriptExecutor jv=(JavascriptExecutor) driver;
jv.executeScript("window.scrollBy(0,500)", "");
}
public static void ScrollUp() {
	JavascriptExecutor jv=(JavascriptExecutor) driver;
	jv.executeScript("window.scrollBy(0,-500)","");
}



}
