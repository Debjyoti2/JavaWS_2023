package com.designpattern.factorydesignpattern;

public class BankAccountFactory {
	
	public static BankAccount getInstances(String accountType) {
		switch(accountType){
			case "BUSINESS" :
				return new BusinessAccount();
			case "PERSONAL" :
				return new PersonalAccount();
			case "CHECKING" :
				return new CheckingAccount();
			default:
				return null;
		}

	}
	

}
