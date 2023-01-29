package com.practice;

public class JointBankAccountThread extends Thread{

	private JointBankAccount jb;
	private String accountName;
	private int withdrawl;


	public JointBankAccountThread(JointBankAccount jb,String accountName,int withdrawl) {
		this.jb=jb;
		this.accountName=accountName;
		this.withdrawl=withdrawl;
	}
	
	@Override
	public void run() {
		while(true) {
			  try {
				jb.withdrawl(this.accountName,this.withdrawl);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
       
	}


}
