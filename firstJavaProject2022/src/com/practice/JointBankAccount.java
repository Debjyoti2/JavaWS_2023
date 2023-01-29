package com.practice;

public class JointBankAccount{

	private double balance=10000;
	
	public void withdrawl(String accountName,int withdrawl) throws InterruptedException {
		if(withdrawl>0 && balance>withdrawl) {
			balance = balance-withdrawl;
			System.out.println("Withdrawl amount by: " + accountName + "Rs : " + withdrawl + " balance :: " + balance);
			Thread.sleep(1000);
		}
		else {
			System.out.println("Sorry " + accountName + " insufficient Balance.. ");
			Thread.sleep(1000);
		}
	}
	
	
	
}
