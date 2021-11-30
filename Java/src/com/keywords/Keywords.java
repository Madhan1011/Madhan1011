package com.keywords;

import com.variables.Static_Variable;

public class Keywords { 

	
int a=45;


public Keywords() {
   System.out.println("CONSTRUCTOR");

}

public void keywords() {
	System.out.println("METHOD NAME");

}


static {  //static method
	System.out.println("Static block");
	
}


public static void main(String[] args) {
	System.out.println("MAIN METHOD");
	Keywords s= new Keywords();
	s.keywords();
	System.out.println(s.a);
	
}





}







