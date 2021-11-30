package com.overriding;

public class Work extends Temple {
	public void murugan(String a) {
		super.murugan(a);
	}
public static void main(String[] args) {
	Work Newtech =new Work();
	Newtech.murugan("Kundrathur");
}
}