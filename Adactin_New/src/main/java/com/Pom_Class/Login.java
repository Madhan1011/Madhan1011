package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

//Webelement username=driver.findelement(By.id("username"));
public static WebDriver driver;
public Login(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	
@FindBy(id = "username")
WebElement username;

@FindBy(id = "password")
WebElement password;

@FindBy(xpath = "//input[@type='Submit']" )
WebElement Login;

public static WebDriver getDriver() {
	return driver;
}
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLogin() {
	return Login;
}



}
