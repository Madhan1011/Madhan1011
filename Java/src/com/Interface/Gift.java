package com.Interface;

public class Gift implements Appa,Amma {

	@Override
	public void gift2() {
		System.out.println("CAR");
		
		
	}

	@Override
	public void gift1() {
		System.out.println("BIKE");
		
	}
	
	public static void main(String[] args) {
		Gift god = new Gift();
		god.gift1();
		god.gift2();
	}

}
