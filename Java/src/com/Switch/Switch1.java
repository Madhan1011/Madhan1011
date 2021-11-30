package com.Switch;

import java.util.Iterator;

public class Switch1 {

	public static void main(String[] args) {
		
		for (int board = 0; board<5; board++) {
			
		
		
		int board1=0;
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
