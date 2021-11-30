package com.string;

public class String_Concept {

	public static void main(String[] args) {

		//String function
		String a ="welcome to Java World";

		// length
		int b =a.length();
		System.out.println(b);

		//equals
		String a1="welcome To Java World";
		boolean e=a.equals(a1);
		System.out.println(e);

		//equalsIgnorecase
		boolean eq=a.equalsIgnoreCase(a1);
		System.out.println(eq);

		//startsWith
		boolean f	=a.startsWith("welcome");
		System.out.println(f);

		//endsWith
		boolean g=a.endsWith("World");
		System.out.println(g);

		//toupperCase
		String h =a.toUpperCase();
		System.out.println(h);

		//tolowerCase
		String i=a.toLowerCase();
		System.out.println(i);

		//contains
		boolean j=a.contains("welcome"); //method searches the sequence of characters in this string
		System.out.println(j);

		//indexOf
		int k=a.indexOf("t");
		System.out.println(k);

		//lastindexOf
		int l=a.lastIndexOf("o");
		System.out.println(l);

		//charAt
		char m =a.charAt(3);
		System.out.println(m);

		//replace
		String n = a.replace("to", "a");
		System.out.println(n);

		//empty
		String a2 = ("");
		boolean r	=a2.isEmpty(); 
		System.out.println(r);

		//substring
		String d=a.substring(10); // Eg.we should give the index value is 10.after that it  consider the remaining(next) character of the index value. .
		System.out.println(d);  

		//split
		String[] u=a.split("o");

		for (String string : u) {
			System.out.println(string);

		}

		//split
		String[] w=a.split("");

		for (String string : w) {
			System.out.println(string);

		}

		//trim

		String q =a1.trim();
        System.out.println(q);

        //compareTo
		String s3="Abc";
		String s4="aef";  //it should be take the ASCII values to compare the character
        System.out.println(s3.compareTo(s4));

        //concat
	    String v=s3.concat(s4);
		System.out.println(v);
		
		//concat
		s3=s3+s4;
		System.out.println(s3);
		
	    //String value
		int v1=200694;
		String v3=String.valueOf(v1);
		System.out.println(v3);
		
		
		
	}


	








}
