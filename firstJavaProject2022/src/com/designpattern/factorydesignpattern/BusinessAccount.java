package com.designpattern.factorydesignpattern;

public class BusinessAccount implements BankAccount{
	
	@Override
	public void calculateInterestrate() {
		System.out.println("calculateInterestrate for BusinessAccount");
		
	}
	
	@Override
	public void registerAccount() {
		System.out.println("registerAccount for BusinessAccount");
		
	}
	
	@Override
	public void validateUserIdentity() {
		System.out.println("validateUserIdentity for BusinessAccount");
		
	}

}
