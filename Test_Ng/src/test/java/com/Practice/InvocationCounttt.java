package com.Practice;

import org.testng.annotations.Test;

public class InvocationCounttt {

	@Test(priority = -4)
	private void bike() {
		// TODO Auto-generated method stub
System.out.println("Bike");
	}
@Test(invocationCount = 3)
	private void bus() {
		// TODO Auto-generated method stub
System.out.println("bus");
	}
@Test(priority = 1)
	private void train() {
		// TODO Auto-generated method stub
System.out.println("train");
	}
@Test(invocationCount = 2)
	private void flight() {
		// TODO Auto-generated method stub
System.out.println("flight");
	
	
	
	
	
}	
	
	
}
