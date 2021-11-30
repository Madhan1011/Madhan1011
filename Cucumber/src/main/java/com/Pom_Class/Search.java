package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
	public static WebDriver driver;

	public Search(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	

@FindBy(id = "location")
WebElement location;
@FindBy(id = "hotels")
WebElement hotel;
@FindBy(id = "room_type")
WebElement room;
@FindBy(id = "room_nos")
WebElement Noofroom;
@FindBy(name = "datepick_in")
WebElement pickdate;
@FindBy(name = "datepick_out")
WebElement outdate;
@FindBy(id = "adult_room")
WebElement adultroom;
@FindBy(id = "child_room")
WebElement childroom;
@FindBy(id = "Submit")
WebElement search;

public static WebDriver getDriver() {
	return driver;
}
public WebElement getLocation() {
	return location;
}
public WebElement getHotel() {
	return hotel;
}
public WebElement getRoom() {
	return room;
}
public WebElement getNoofroom() {
	return Noofroom;
}
public WebElement getPickdate() {
	return pickdate;
}
public WebElement getOutdate() {
	return outdate;
}
public WebElement getAdultroom() {
	return adultroom;
}
public WebElement getChildroom() {
	return childroom;
}
public WebElement getSearch() {
	return search;
}













}
