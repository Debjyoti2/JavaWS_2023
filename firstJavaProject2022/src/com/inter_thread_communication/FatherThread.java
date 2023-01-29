package com.inter_thread_communication;

public class FatherThread extends Thread{
	
	private String name;
	private double depositAmount;
	private FamilyBankAccount familybankaccount;
	
	FatherThread(String name, double depositAmount,FamilyBankAccount familybankaccount){
		this.name=name;
		this.depositAmount=depositAmount;
		this.familybankaccount =familybankaccount;
	}

	@Override
	public void run() {
		while(true) {
			try {
				this.familybankaccount.depositMoney(name, depositAmount);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
