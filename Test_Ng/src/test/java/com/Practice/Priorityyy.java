package com.Practice;

import org.testng.annotations.Test;

public class Priorityyy {
	
	@Test
	private void Car() {
		// TODO Auto-generated method stub
System.out.println("Car");
	}
@Test(priority = -4)
	private void bike() {
		// TODO Auto-generated method stub
System.out.println("Bike");
	}
@Test
	private void bus() {
		// TODO Auto-generated method stub
System.out.println("bus");
	}
@Test(priority = -3)
	private void train() {
		// TODO Auto-generated method stub
System.out.println("train");
	}
@Test(priority = 1)
	private void flight() {
		// TODO Auto-generated method stub
System.out.println("flight");
	}
@Test(priority = -1)
private void refresh() {
	// TODO Auto-generated method stub
System.out.println("Refresh");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
