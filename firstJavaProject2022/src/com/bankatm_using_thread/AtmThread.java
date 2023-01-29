package com.bankatm_using_thread;

public class AtmThread extends Thread{

	
	Account account;
	private String personName;
	private int withdrawAmount;
	
	
	AtmThread(Account account, String personName,int withdrawAmount){
		this.account=account;
		this.personName=personName;
		this.withdrawAmount =withdrawAmount;
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			 this.account.withdrawamount(personName,withdrawAmount);
		}
	  
	}
}
