package com.type_casting;

public class Casting {

	public static void main(String[] args) {
		
		//widening type casting-Low to High
		byte a=15;    //byte 1 // bit 8
		int b=a;      //int 4  // bit 32
		
		System.out.println(b);
		
		
		
		//Narrowing type casting-High to Low
		
		
		long c=20l;   //double 8 // bit 64
		double d=c; //float 4 // bit 32

		System.out.println(d);
		
		double e=45.60;
		float f=(float) e;
		System.out.println(f);
		
		double g=50.70;
		short h=(short) g;
		System.out.println(g);
		
		int i=40;
		byte j=(byte) i;
		
		System.out.println(i);
		
	}

}
