package com.scanner;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		
		System.out.println("ENTER YOUR MARK");
		
		Scanner sc = new Scanner(System.in);
		
		int mark = sc.nextInt();
		
		if (mark<50) {
			System.out.println("FAIL");
		} else if (mark>=50 && mark<60) {

		System.out.println("D GRADE");
		
		} else if (mark>=60 && mark<70) {

			System.out.println("C GRADE");
		} else if (mark>=70 || mark<80) {

			System.out.println("B GRADE");
	
		} else if (mark>=80 && mark<90) {

			System.out.println("A GRADE");
		} else if (mark>=90 && mark<100) {

			System.out.println("S GRADE");
		
		}else {
			System.out.println("INVALID");
		}
		
		
		
		}
	
	
}
