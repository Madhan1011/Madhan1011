package com.string;

public class String_Type2 {

	public static void main(String[] args) {
		
//immutable string
	
	String s1="Madhan";
	String s2="Kumar";
	System.out.println("Immutable string");
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
	String r=s1.concat(s2);
	System.out.println(r);
	System.out.println(System.identityHashCode(r));

	
	//Mutable string
	
	StringBuffer x1=new StringBuffer("Madhan");
	StringBuffer x2=new StringBuffer("Kumar");
	System.out.println("mutable string");
	System.out.println(System.identityHashCode(x1));
	System.out.println(System.identityHashCode(x2));
    StringBuffer x3=x1.append(x2);
    System.out.println(x3);
    System.out.println(System.identityHashCode(x3));




	}

}



