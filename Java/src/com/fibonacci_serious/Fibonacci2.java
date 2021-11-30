package com.fibonacci_serious;

public class Fibonacci2 {

public static void main(String[] args) {
		
		int a1=0,a2=1,a3;
		
		System.out.println(a1);
		System.out.println(a2);
		
		for (int i = 0; i < 15; i++) {
			
			a3=a1+a2;
		
			System.out.println(a3);
			
			a1=a2;
			a2=a3;
			
			
		
		
		if (i==5) {
			continue;
		}
		
		System.out.println(i);
		
		}
		
		
		
		
	}
	
	
	
}
