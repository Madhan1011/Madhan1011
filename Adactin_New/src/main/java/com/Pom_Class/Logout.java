package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	public static WebDriver driver;
	public Logout(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
}
	@FindBy(id = "logout")
	WebElement logout;
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getLogout() {
		return logout;
	}








}