package com.designpattern.factorydesignpattern;

public class BankAccountFactory {
	
	public static BankAccount getInstances(String accoutType) {
		
		BankAccount bankAccount=null;
		
		if(accoutType.equals("BUSINESS")) {
			bankAccount =  new BusinessAccount();
		}
		else if(accoutType.equals("PERSONAL")) {
			bankAccount=  new PersonalAccount();
		}
		else if(accoutType.equals("CHECKING")) {
			bankAccount =  new CheckingAccount();
		}
		
		return bankAccount;
		
	}
	

}
