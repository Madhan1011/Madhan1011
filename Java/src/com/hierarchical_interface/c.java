package com.hierarchical_interface;

public class c extends A {

	public void studentname() {
		System.out.println("studentname : madhan");
	}
	public void studentid() {
		System.out.println("studentid : 3467");
		
}
	 public static void main(String[] args) {
			c cell = new c();
			cell.company_Name();
			cell.address();
			cell.studentname();
			cell.studentid();

}

}
