package com.practice;

public class JbThreadRunner {
	
	public static void main(String[] args) {
		
		JointBankAccount jb = new JointBankAccount();
		
		JointBankAccountThread th1 = new JointBankAccountThread(jb, "Kittu", 5000);
		JointBankAccountThread th2 = new JointBankAccountThread(jb, "Debrup",3000);
		th1.setPriority(Thread.MAX_PRIORITY);
		th1.start();
		th2.start();
		
	}

}
