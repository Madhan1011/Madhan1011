package com.scanner;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		
		System.out.println("ELIGIBLE VOTE OR NOT ELIGIBLE VOTE");
		
		Scanner count = new Scanner(System.in);
		
		int a = count.nextInt();
		
		if (a>18) {
			System.out.println("ELIGIBLE TO VOTE");
		} else {
        System.out.println("NOT ELIGIBLE VOTE");
		}
		
		
		
	}
	
	
	
}



