package com.constructor;

public class Google {
	public Google() {
		System.out.println("Global");
	}

	public Google (String b) {
 System.out.println(b);
	}	
	
	public Google (Float c) {
		System.out.println("Love"+c);
		
	}
	public Google (Long d) {
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		
	
	
	Google india = new Google();
	Google india1 = new Google("World");	
	Google india2 = new Google(20f); 
    Google india3 = new Google(50l);
}

}