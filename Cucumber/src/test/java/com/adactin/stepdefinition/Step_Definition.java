package com.adactin.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Base_Class.Base_Class2;
import com.Pom_Class.Book_Now;
import com.Pom_Class.Continue;
import com.Pom_Class.Login;
import com.Pom_Class.Logout;
import com.Pom_Class.Search;
import com.adactin.helper.File_Reader_Manager;
import com.adactin.helper.Page_Object_Manager;
import com.adactin.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class2{

	public static WebDriver driver=Test_Runner.driver;
//	Login a=new Login(driver);
//	Search b=new Search(driver);
//	Continue c=new Continue(driver);
//	Book_Now d=new Book_Now(driver);
//	Logout e=new Logout(driver);
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	@Given("^User Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
      openUrl(url);
	}
	
	@When("^User Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 inputValues(pom.getInstance_Login().getUsername(), username);
	}

	@When("^User Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		inputValues(pom.getInstance_Login().getPassword(), password);
	}


//	@When("^User Enter The Username In Username Field$")
//	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
////	   inputValues(a.getUsername(), "Madhan1020");
//	   inputValues(pom.getInstance_Login().getUsername(), "Madhan1020");
//
//		
//	}
//
//	@When("^User Enter The Password In Password Field$")
//	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	   
//	//	inputValues(a.getPassword(), "Madhan@1020");
//		inputValues(pom.getInstance_Login().getPassword(), "Madhan@1020");

//	}

	@Then("^User Click On The Login Button And It Navigate To Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page() throws Throwable {
	 // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
//		 clickOnElement(a.getLogin());
	 clickOnElement(pom.getInstance_Login().getLogin());
		
	}
	@When("^User Select The Location In Location Field$")
	public void user_Select_The_Location_In_Location_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	   dropDown1(b.getLocation(), "London");
	   dropDown1(pom.getInstance_Search().getLocation(), "London");

	}

	@When("^User Select The Hotel In Hotel Field$")
	public void user_Select_The_Hotel_In_Hotel_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 //   dropDown1(b.getHotel(), "Hotel Sunshine");
	    dropDown1(pom.getInstance_Search().getHotel(), "Hotel Sunshine");
	
	}

	@When("^User Select The Room Type In Room Type Field$")
	public void user_Select_The_Room_Type_In_Room_Type_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//   dropDown1(b.getRoom(), "Deluxe");
	   dropDown1(pom.getInstance_Search().getRoom(), "Deluxe");

	}

	@When("^User Select The Number Of Room In Number Of Room Field$")
	public void user_Select_The_Number_Of_Room_In_Number_Of_Room_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
  //    dropDown2(b.getNoofroom(), 2);
	      dropDown2(pom.getInstance_Search().getNoofroom(), 2);
  
	}

	@When("^User Enter The In Date In Check In Date Field$")
	public void user_Enter_The_In_Date_In_Check_In_Date_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	  inputValues(b.getPickdate(), "24/11/2021");
	  inputValues(pom.getInstance_Search().getPickdate(), "24/11/2021");

	}

	@When("^User Enter The Out Date In Check Out Date Field$")
	public void user_Enter_The_Out_Date_In_Check_Out_Date_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//   inputValues(b.getOutdate(), "25/11/2021");
	   inputValues(pom.getInstance_Search().getOutdate(), "25/11/2021");

	}

	@When("^User Select The Adult Per Room In Adult Per Room$")
	public void user_Select_The_Adult_Per_Room_In_Adult_Per_Room() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	dropDown2(b.getAdultroom(), 4);
	dropDown2(pom.getInstance_Search().getAdultroom(), 4);
	
	}

	@When("^User Select The Children Per Room In Children Per Room$")
	public void user_Select_The_Children_Per_Room_In_Children_Per_Room() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	 dropDown2(b.getChildroom(), 2);
	 dropDown2(pom.getInstance_Search().getChildroom(), 2);

	}
	@Then("^User Click On the Search Button And It Navigate To Continue Page$")
	public void user_Click_On_the_Search_Button_And_It_Navigate_To_Continue_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		Thread.sleep(3000);
//	  clickOnElement(b.getSearch());
		  clickOnElement(pom.getInstance_Search().getSearch());

	}

	
	@When("^User Click on The Select In Select Field$")
	public void user_Click_on_The_Select_In_Select_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//    clickOnElement(c.getRadiobutton());
	    clickOnElement(pom.getInstance_Continue().getRadiobutton());
   
	}

	@Then("^User Click On The Continue Button and It Navigate To Book Now Page$")
	public void user_Click_On_The_Continue_Button_and_It_Navigate_To_Book_Now_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//   clickOnElement(c.getClick());
	   clickOnElement(pom.getInstance_Continue().getClick());

	}
	
	@When("^User Enter The Firstname In Firstname Field$")
	public void user_Enter_The_Firstname_In_Firstname_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//   inputValues(d.getFirstname(), "Madhankumar");
	   inputValues(pom.getInstance_Book_Now().getFirstname(), "Madhankumar");

	}

	@When("^User Enter The Lastname In Lastname Field$")
	public void user_Enter_The_Lastname_In_Lastname_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	//   inputValues(d.getLastname(), "Sekar");
	   inputValues(pom.getInstance_Book_Now().getLastname(), "Sekar");

	}

	@When("^User Enter The Address In Billing Address Field$")
	public void user_Enter_The_Address_In_Billing_Address_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	  inputValues(d.getAddress(), "Rengachipatti,Kulithalai,Karur");
	  inputValues(pom.getInstance_Book_Now().getAddress(), "Rengachipatti,Kulithalai,Karur");

	}
	
	@When("^User Enter The \"([^\"]*)\" In Credit Card No Field$")
	public void user_Enter_The_In_Credit_Card_No_Field(String creditcardno) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 inputValues(pom.getInstance_Book_Now().getCreditcardno(), creditcardno);

//	@When("^User Enter The Credit Card No In Credit Card No Field$")
//	public void user_Enter_The_Credit_Card_No_In_Credit_Card_No_Field() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
////	 inputValues(d.getCreditcardno(), "1234567891234567");
//	 inputValues(pom.getInstance_Book_Now().getCreditcardno(), "1234567891234567");

	}

	@When("^User Select The Credit Card Type In Credit Card Type Field$")
	public void user_Select_The_Credit_Card_Type_In_Credit_Card_Type_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	  dropDown2(d.getCardtype(), 3);
	  dropDown2(pom.getInstance_Book_Now().getCardtype(), 3);

	}

	@When("^User Select The Month In Expiry Date Field$")
	public void user_Select_The_Month_In_Expiry_Date_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	 dropDown2(d.getExpirydate(), 6);
	 dropDown2(pom.getInstance_Book_Now().getExpirydate(), 6);

	}

	@When("^USer Select The Year In Expiry Date Field$")
	public void user_Select_The_Year_In_Expiry_Date_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions;
//	dropDown3(d.getExpiryyear(), "2022");
	dropDown3(pom.getInstance_Book_Now().getExpiryyear(), "2022");

	}

	@When("^User Enter The CVV Number In CVV Number Field$")
	public void user_Enter_The_CVV_Number_In_CVV_Number_Field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	  inputValues(d.getCvvno(), "123");
	  inputValues(pom.getInstance_Book_Now().getCvvno(), "123");

	}

	@Then("^User Click On The Book Now Button And It Navigate to Logout Page$")
	public void user_Click_On_The_Book_Now_Button_And_It_Navigate_to_Logout_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(2000);
	//	clickOnElement(d.getLogin());
		clickOnElement(pom.getInstance_Book_Now().getLogin());

		implicitlyWait();
	}
	
	@When("^User Click On The Logout Button$")
	public void user_Click_On_The_Logout_Button() throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
	Thread.sleep(2000);
//		clickOnElement(e.getLogout());
		clickOnElement(pom.getInstance_Logout().getLogout());

	}

	














}
