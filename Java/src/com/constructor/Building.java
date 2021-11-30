package com.constructor;

public class Building {
	
	public Building() {  // Default constructor
		System.out.println("Construction");
		
	}

	public Building (int a) { // Parameterized Constructor
		System.out.println("Location"+a);
	}
	  
	public static void main(String[] args) {
	
		Building place = new Building();
		Building trichy =new Building(90);
	
	
	
	}
	
}
