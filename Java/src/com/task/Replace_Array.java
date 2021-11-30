package com.task;

public class Replace_Array {

public static void main (String[] args) {
	
	int a[]=new int[] {10,20,30,90,10,10}; //replace the 10 into 100 in list
	
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=90;
	a[4]=10;
	a[5]=10;
	a[0]=100;
	a[4]=100;
	a[5]=100;
	
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+",");
	}
	
	
	
	
	
	
}





}




