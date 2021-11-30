package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Continue {
public static WebDriver driver;
public Continue(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	@FindBy(id = "radiobutton_0")
	WebElement radiobutton;
	@FindBy(id = "continue")
	WebElement click;
	
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getClick() {
		return click;
	}

	
	
}
