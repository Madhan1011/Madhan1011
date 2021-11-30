package com.array;

public class Sum_Array {

	public static void main(String[] args) {
		
		int a[]= new int[] {1,2,3,4,5,6,7,8,9,10}; //single dimensional array
		

		
		int sum=0;
		
		for (int i = 0; i < 10; i++) { 
		
			sum=sum+a[i];
			
		}
		
		System.out.println(sum);
		
		
	}
	
	
}

