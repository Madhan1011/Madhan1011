package com.Exception;

public class Throws_Concept {
public static void main(String[] args) throws InterruptedException {
	

	int age=17;
	
	Thread.sleep(age);
	
	if (age>=18) {
		System.out.println("vote");
	} else {
       throw new NullPointerException("not vote");
	}
	
	
	
	
	
}
	
	
}
