package com.Switch;

import java.util.Scanner;

public class Switch3 {

public static void main(String[] args) {
	
	for (int i = 0; i < 6; i++) {
		
	
	System.out.println("ENTER THE SWITCH");
	Scanner sc=new Scanner(System.in);
		int board=sc.nextInt();
		
			switch (board) {
		case 1:
			System.out.println("TV");
			break;
		case 2:
			System.out.println("FRIDGE");
			break;
		case 3:
			System.out.println("FAN");
			break;
		case 4:
			System.out.println("LIGHT");
			break;
		case 5:
			System.out.println("WASHING MACHINE");
			break;
		default:
			System.out.println("INVALID SWITCH");
			break;
		}
		

	}

	
}
	
	
}

	



