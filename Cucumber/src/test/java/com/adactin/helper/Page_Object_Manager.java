package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Pom_Class.Book_Now;
import com.Pom_Class.Continue;
import com.Pom_Class.Login;
import com.Pom_Class.Logout;
import com.Pom_Class.Search;

public class Page_Object_Manager {
public WebDriver driver;
private Login login;
private Search search;
private Continue continuee;
private Book_Now book;
private Logout logout;




	public Page_Object_Manager(WebDriver driver) {

	this.driver=driver;
		
	PageFactory.initElements(driver, this);	
		
	}
	
public Login getInstance_Login() {
login=new Login(driver);
	
	return login;
	
}

public Search getInstance_Search() {
search=new Search(driver);
	return search;
	
}

public Continue getInstance_Continue() {
	continuee=new Continue(driver);
return continuee;
}

public Book_Now getInstance_Book_Now() {
	book=new Book_Now(driver);
return book;

}

public Logout getInstance_Logout() {
	logout=new Logout(driver);
	return logout;
}










}
