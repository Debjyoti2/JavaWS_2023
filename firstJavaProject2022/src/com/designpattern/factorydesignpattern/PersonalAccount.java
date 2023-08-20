package com.designpattern.factorydesignpattern;

public class PersonalAccount implements BankAccount{
	
	@Override
	public void calculateInterestrate() {
		System.out.println("calculateInterestrate for PersonalAccount");
		
	}
	
	@Override
	public void registerAccount() {
		System.out.println("registerAccount for PersonalAccount");
		
	}
	
	@Override
	public void validateUserIdentity() {
		System.out.println("validateUserIdentity for PersonalAccount");
		
	}

}
