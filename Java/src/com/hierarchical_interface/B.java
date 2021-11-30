package com.hierarchical_interface;


public class B extends A {

	public void city() {
  System.out.println("CHENNAI");
	}
 public void pincode() {
	System.out.println("639110");
}

 public static void main(String[] args) {
	B cell = new B();
	cell.company_Name();
	cell.address();
	cell.city();
	cell.pincode();
			
}



}



