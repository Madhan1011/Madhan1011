package com.overriding;

public class  Goa extends Class_Ride {

	public void bike(int a) {
		super.bike(a);
		}
	public static void main(String[] args) {
		
		Goa tour = new Goa();
		tour.bike(200);
		
	}
	
}