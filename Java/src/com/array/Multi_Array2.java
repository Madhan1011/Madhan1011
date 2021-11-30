package com.array;

public class Multi_Array2 {

	public static void main(String[] args) {
		
		
		
		int a[][] = new int[2][2];  //multi dimentional array
		
		a[0][0]=20;
		a[0][1]=40;
		a[1][0]=60;
		a[1][1]=80;
		
		
		for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 2; j++) {
			
			System.out.print(a[i][j]+" ");
			
			
		}
			
		System.out.println();
		}
		

		
		
		
	}
	
	
	
	
	
}
