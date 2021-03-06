package com.hotel.Adactin_New;

import java.io.IOException;

import com.Base_Class.Base_Class1;
import com.Pom_Class.Book_Now;
import com.Pom_Class.Continue;
import com.Pom_Class.Login;
import com.Pom_Class.Logout;
import com.Pom_Class.Search;

public class App_Test1 extends Base_Class1 {
public static void main(String[] args) throws IOException {
	browserLaunch();
	openUrl("https://adactinhotelapp.com/");
	Login a=new Login(driver);
	inputValues(a.getUsername(), "Madhan1020");
	inputValues(a.getPassword(), "Madhan@1020");
	clickOnElement(a.getLogin());
	Search b=new Search(driver);
	dropDown1(b.getLocation(), "London");
	dropDown1(b.getHotel(), "Hotel Sunshine");
	dropDown1(b.getRoom(), "Deluxe");
	dropDown2(b.getNoofroom(), 2);
	inputValues(b.getPickdate(), "23/11/2021");
	inputValues(b.getOutdate(), "25/11/2021");
	dropDown2(b.getAdultroom(), 4);
	dropDown2(b.getChildroom(), 2);
	clickOnElement(b.getSearch());
	Continue c=new Continue(driver);
	clickOnElement(c.getRadiobutton());
	getText(c.getClick());
	clickOnElement(c.getClick());
	Book_Now d=new Book_Now(driver);
	inputValues(d.getFirstname(), "Madhankumar");
	inputValues(d.getLastname(), "Sekar");
	inputValues(d.getAddress(), "Rengachipatti,kulithalai,karur");
	inputValues(d.getCreditcardno(), "1234567891234567");
	dropDown2(d.getCardtype(), 3);
	dropDown2(d.getExpirydate(), 6);
	dropDown3(d.getExpiryyear(), "2022");
	inputValues(d.getCvvno(), "123");
	clickOnElement(d.getLogin());
	implicitlyWait();
	Logout e=new Logout(driver);
	clickOnElement(e.getLogout());
	takesCreenshot("C:\\Users\\ELCOT\\eclipse-workspace\\Adactin_New\\ScreenShot");
	
}


}
