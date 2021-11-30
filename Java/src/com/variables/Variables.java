package com.variables;

public class Variables {

	int a=10;//class variable
	
	public void add() {
		
		int a=14;//local variable
		System.out.println(a);
		
	}
	
	
	public void multi() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Variables sc= new Variables();
		
		sc.add();
		sc.multi();
		
		
	}
	

		

	}


