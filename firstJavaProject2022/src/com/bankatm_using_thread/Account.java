package com.bankatm_using_thread;

public class Account {
	
	private int balance =10000;
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdrawamount(String personName,int amount) {
		if(balance>=amount) {
			balance = balance-amount;
			System.out.println("Amount withdrawn by :" + personName + " is ::" + amount + " balance is ::" + balance);
			
		}
		else {
			System.out.println("sorry " + personName + " not enough balance");
		}
		
	}
	
	

}
