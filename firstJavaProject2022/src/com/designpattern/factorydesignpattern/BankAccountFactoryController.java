package com.designpattern.factorydesignpattern;

//@RestController
public class BankAccountFactoryController {

	//@GetMapping("/registerAccount/{accountType}")
	public void registerAccount( /* @PathVariable ("accountType") */String accountType ) {
		
		BankAccount bankAccount = BankAccountFactory.getInstances(accountType);
		bankAccount.registerAccount();
		bankAccount.calculateInterestrate();
		bankAccount.validateUserIdentity();
		
	}
	
}
