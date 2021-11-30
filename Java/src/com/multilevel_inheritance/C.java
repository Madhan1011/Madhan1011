package com.multilevel_inheritance;

public class C extends B{
	
	public void studentname() {
		System.out.println("studentname : madhan");
	}
	public void studentid() {
		System.out.println("studentid : 3467");
		
	}
	
	public static void main(String[] args) {
		
		C a = new C();
		a.CollegeAdd();
		a.collegeName();
		a.staffNme();
		a.staffid();
		a.studentname();
		a.studentid();
		
		
		
		
	}
	
	
	
	
	
	
}
