package com.inter_thread_communication;

public class FamilyBankAccount {
	
	private double accountBalance;

	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
	public synchronized void depositMoney(String depositedBy,double depositedAmount) throws InterruptedException {
		if(depositedAmount>0) {
			System.out.println("Money Rs : " + depositedAmount + " has been deposited by :: " + depositedBy);
			this.accountBalance = this.accountBalance + depositedAmount;
			System.out.println("Current Account Balance is RS :: " + this.accountBalance );
			Thread.sleep(1000);
			notifyAll();
		}
	}
	
	public synchronized void withdrawAmount(String withdrawnBy,double withdrawlAmount) throws InterruptedException {
		if(this.accountBalance>=withdrawlAmount) {
			this.accountBalance =this.accountBalance-withdrawlAmount;
			System.out.println("Money Rs : " + withdrawlAmount + " has been withdrawl by :: " + withdrawnBy + "  Current Balance RS :: " + this.accountBalance);
		}else {
			wait();
			System.out.println("Sorry :: " + withdrawnBy + " !! Insufficient Balance");
		}
		Thread.sleep(1000);
	}
	

}
