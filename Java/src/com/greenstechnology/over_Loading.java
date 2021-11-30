package com.greenstechnology;


public class over_Loading {
	
	
	
	public void office() {
		System.out.println("Newtech");
	}
	
	public void office(int a ) {
		System.out.println(a);
		
	}

	public void office(String a,int b) {
		System.out.println(a+b);
		
	}
public void office(int a,int b,int c) {
	System.out.println(a+b+c);
	
}		

public static void main(String[] args) {
	
	over_Loading work= new over_Loading();
	
	work.office();
	work.office(10);
	work.office("ab", 20);
	work.office(10, 20, 30);
	
	
	
}
}
