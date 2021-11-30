package com.Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Data_Provider {

	@Test(dataProvider = "test_Data")
	private void Credential(String username,int password) {
		// TODO Auto-generated method stub

		System.out.println("Username = "+username);
		System.out.println("Password ="+password);
		
	}

	//object[][]
	@DataProvider
	private Object[][] test_Data() {
	// TODO Auto-generated method stub

	return new Object[][] {
	
		{"neymar",123456},
		{"madhan",200693},
		{"mani",12345},
		{"kumar",123457}
	
	
	
};

	}	
	
	
}
