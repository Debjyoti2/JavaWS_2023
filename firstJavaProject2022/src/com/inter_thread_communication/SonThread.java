package com.inter_thread_communication;

public class SonThread extends Thread{

	private String name;
	private double depositAmount;
	private FamilyBankAccount familybankaccount;
	
	SonThread(String name, double depositAmount,FamilyBankAccount familybankaccount){
		this.name=name;
		this.depositAmount=depositAmount;
		this.familybankaccount =familybankaccount;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				this.familybankaccount.withdrawAmount(name, depositAmount);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		

	}
	
}
