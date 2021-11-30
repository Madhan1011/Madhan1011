package com.Armstrong_number;

import java.util.Scanner;

public class Armstrong {

	static int temp,a,ans=0;
	
public static void main(String[] args) {
	
	System.out.println("Armstorng no. from 1 to 1000 :");
	for (int i = 1; i <=1000; i++) {
		temp=i;
	
	while (temp>0) {
		
		a=temp%10;
		ans=ans+(a*a*a);
		temp=temp/10;
	}
	if (ans==i) {
		System.out.println(i+" ");
	}
	ans = 0 ;
	
	}
}

}



