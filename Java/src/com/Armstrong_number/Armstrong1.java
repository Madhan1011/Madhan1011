package com.Armstrong_number;

import java.util.Scanner;

public class Armstrong1 {
	static int temp,a,ans=0;
	
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			
		
		System.out.println("Enter the number");
		
			
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		temp=n;
		
		while (n>0) {
			
			a=n%10;
			ans=ans+(a*a*a);
			n=n/10;
			
		}
		
		if (temp==ans) {
			System.out.println("Amstrong Number");
		} else {
	System.out.println("Non Amstrong Number");
		}
		
	}


	}

	}
	
	
	
	
}
