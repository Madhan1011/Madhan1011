package com.Practice;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {

	@Test
	@Parameters({"usernme","password"})
private void Credential(@Optional("messi") String username,int password) {
	// TODO Auto-generated method stub

	System.out.println("Username = "+username);
	System.out.println("Password ="+password);
	
	
	
}


















}
