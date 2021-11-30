package com.keywords;

public class Key extends Keywords1{

	
	int a=50;
	
	public void demo() {
	
		System.out.println(this.a);  //current class reference

		System.out.println(super.a);  // parent class reference
	}
	
	
	public static void main(String[] args) {
		
		Key s= new Key();
		
		s.demo();
		
		
		
	}
	
	
	
	
	
	
}