package com.string;

public class String_Type1 {

public static void main(String[] args) {
	
	//immutable string
	
	
	String s="Welcome to Java World";   
	System.out.println(System.identityHashCode(s));
	
	String s1="Welcome to Java World";
	System.out.println(System.identityHashCode(s1));
	
	//conCat
	
	s=s+s1;
	System.out.println(s);
	System.out.println(System.identityHashCode(s));
	
	
	
	
	
	
	
	
	
}








}


