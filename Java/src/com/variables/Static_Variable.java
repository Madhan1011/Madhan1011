package com.variables;

public class Static_Variable {

static int a=20;//class variable
	
	public static void add() {
		
		int a=14;//static variable
		System.out.println(a);
		
	}
	
	
	public static void multi() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		add();//no object creation.only we call the method and then get output.
		
		multi();
		
		
	}
	

	
	
	
	
	
	
}




