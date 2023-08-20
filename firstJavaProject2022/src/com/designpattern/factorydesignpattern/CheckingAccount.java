package com.designpattern.factorydesignpattern;

public class CheckingAccount implements BankAccount{
	
	@Override
	public void calculateInterestrate() {
		System.out.println("calculateInterestrate for CheckingAccount");
		
	}
	
	@Override
	public void registerAccount() {
		System.out.println("registerAccount for CheckingAccount");
		
	}
	
	@Override
	public void validateUserIdentity() {
		System.out.println("validateUserIdentity for CheckingAccount");
		
	}

}
