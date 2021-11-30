package com.scanner;

import java.util.Scanner;

public class Scanner_Words {

	public static void main(String[] args) {
		System.out.println("ENTER SOME WORDS");
		Scanner name = new Scanner(System.in);
		 String a = name.nextLine();
		System.out.println(a);
		
		System.out.println("ENTER THE NUMBER");
		int b = name.nextInt();
		System.out.println(b);
		
		System.out.println("ENTER THE WORD");
	   String c	=name.next();
	   System.out.println(c);
	   
	  System.out.println("ENTER THE STRING OR CHAR");
		char d=name.next().charAt(1);
		System.out.println(d);
	}
	
	
	
}
