package com.designpattern.factorydesignpattern;

//@RestController
public class BankAccountFactoryController {

	//@GetMapping("/registerAccount/{accountType}")
	public void registerAccount( /* @PathVariable ("accountType") */String accountType ) {
		
		BankAccount bankAccount = BankAccountFactory.getInstances(accountType);
		bankAccount.registerAccount();
		bankAccount.calculateInterestrate();
		bankAccount.validateUserIdentity();

		//same factory deciding logic i can put in a drools excel file and from there i
		// can return the Impl class to call..
		// Its a alternative approach used in industry..
		
	}
	
}
