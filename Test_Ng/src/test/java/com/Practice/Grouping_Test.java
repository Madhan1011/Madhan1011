package com.Practice;

import org.testng.annotations.Test;

public class Grouping_Test {
@Test(groups = "Electronics")
private void apple() {
	// TODO Auto-generated method stub
System.out.println("Apple");
}
@Test(groups = "Electronics")
private void oneplus() {
	// TODO Auto-generated method stub
System.out.println("Oneplus");
}
@Test(groups = "Electronics")
private void samsung() {
	// TODO Auto-generated method stub
System.out.println("Samsung");
}
@Test(groups = "Fruits")
private void banana() {
	// TODO Auto-generated method stub
System.out.println("banana");
}
@Test(groups = "Fruits")
private void mango() {
	// TODO Auto-generated method stub
System.out.println("Mango");
}








}
