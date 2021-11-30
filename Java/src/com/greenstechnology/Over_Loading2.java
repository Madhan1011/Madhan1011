package com.greenstechnology;

public class Over_Loading2 {

	public void office() {
		System.out.println("Newtech");
	}
	
	public void office(char a ) {
		System.out.println(a);
		
	}

	public void office(char a,int b) {
		System.out.println(a+b);
		
	}
public void office(int a,int b,int c) {
	System.out.println(a+b+c);
	
}		

public static void main(String[] args) {
	
	Over_Loading2 work= new Over_Loading2();
	
	work.office();
	work.office('A');
	work.office('a', 20);
	work.office(10, 20, 30);
	
	
	
}
}


