package com.abstractclass;

public class Bankdetails extends Government {

	@Override
	public void ifsc() {
		System.out.println("HDFC0001780");
		
		
	}

	@Override
	public void accno() {
		System.out.println("123456");
		
		}
	public static void main(String[] args) {
		
	Bankdetails bank = new Bankdetails();
	bank.bank_Name();
	bank.branch();
	bank.city();
	bank.accno();
	bank.ifsc();

}
}