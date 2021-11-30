package com.hotel.Adactin_New;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base_Class.Base_Class1;

public class App_Test extends Base_Class1 {

	public static void main(String[] args) throws AWTException, IOException {
		
		browserLaunch();
		openUrl("https://www.google.com/");
		close();
		quit();
		navigateTo("https://www.facebook.com/");
		navigateBack();
		navigateForward();
		navigateRefresh();
		alertAccept();
		alertDismiss();
		WebElement a = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]"));
		inputValues(a,"madhan");
		actionClick(a);
		contextClick(a);
		doubleClick(a);
		moveToElement(a);
		dragAndDrop(a, a);
		clickOnElement(a);
		frames(a);
		robot();
		windowHandles();
		dropDown1(a, "madhan");
		dropDown2(a, 5);
		dropDown3(a, null);
		isMultiple(a);
		getOptions(a);
		getFirstSelected(a);
		getAllSelected(a);
		checkBox(a);
		isEnable(a);
		isDisplayed(a);
		isSelected(a);
		getTitle();
		getCurrentUrl();
		getText(a);
		getAttribute(a, "value");
		implicitlyWait();
		explicitlyWait(a);
		takesCreenshot("path");
		ScrollDown();
		ScrollUp();
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
