package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Now {
	public static WebDriver driver;
	public Book_Now(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);

	}
	
	@FindBy(id = "first_name")
	WebElement firstname;
	@FindBy(id = "last_name")
	WebElement lastname;
	@FindBy(id = "address")
	WebElement address;
	@FindBy(id = "cc_num")
	WebElement creditcardno;
	@FindBy(id = "cc_type")
	WebElement cardtype;
	@FindBy(id = "cc_exp_month")
	WebElement expirymonth;
	@FindBy(id = "cc_exp_year")
	WebElement expiryyear;
	@FindBy(id = "cc_cvv")
	WebElement cvvno;
	@FindBy(id = "book_now")
	WebElement login;
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCreditcardno() {
		return creditcardno;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getExpirydate() {
		return expirymonth;
	}
	public WebElement getExpiryyear() {
		return expiryyear;
	}
	public WebElement getCvvno() {
		return cvvno;
	}
	public WebElement getLogin() {
		return login;
	}

	
	
}
