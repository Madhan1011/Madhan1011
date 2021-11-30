package com.hierarchical_interface;

public class D extends A {
	public void collegeName() {
		System.out.println("college name : cauvery ");
	}
		public void CollegeAdd() {
			System.out.println("address :xyz");
		}
		
		public static void main(String[] args) {
			D cell = new D();
			cell.company_Name();
			cell.address();
			cell.collegeName();
			cell.CollegeAdd();
		}
	
	
}
