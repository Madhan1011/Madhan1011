package com.Exception;

public class Exception_Concept {

	public static void main(String[] args) {
		//arithmetic Expression
		// int a=10;
		//System.out.println(a/0);
		
		// double b=10.0;
		//System.out.println(b/0);
		
		//try catch 
		
	//	int a=10;
	//	try {
			
	//		System.out.println(a/0);
			
	//	} catch (Exception e) {
			
	//		System.out.println("Restof the line will be Run");
			
	//	}
	//	System.out.println("Java");
		
//	}
	
	//Final
	
	int a=10;
	try {
		
		System.out.println(a/0);
		
	}finally {
		System.out.println("Final block");
	}
	System.out.println("Java");
	
}
	
	
}
