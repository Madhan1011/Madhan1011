package com.Practice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignoree {

@Ignore	
@Test
	private void Car() {
		// TODO Auto-generated method stub
System.out.println("Car");
	}
@Test
	private void bike() {
		// TODO Auto-generated method stub
System.out.println("Bike");
	}
@Test(enabled = false)
	private void bus() {
		// TODO Auto-generated method stub
System.out.println("bus");
	}
@Test
	private void train() {
		// TODO Auto-generated method stub
System.out.println("train");
	}
@Test
	private void flight() {
		// TODO Auto-generated method stub
System.out.println("flight");
	}
	
	
}
