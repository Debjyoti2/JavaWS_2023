package com.practice;

public class BankRunner {
	
	public static void main(String[] args) {
		AxisBank axb= new AxisBank();
		axb.calculateBankProfitMargin();
		axb.calculateEmiInterest();
		axb.getUserDetails();
		
		Sbi sbi = new Sbi();
		sbi.calculateBankProfitMargin();
		sbi.calculateEmiInterest();
		sbi.getUserDetails();
	}

}
