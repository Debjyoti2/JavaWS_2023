package com.inter_thread_communication;

public class FamilyBankAccount_Runner {

	public static void main(String[] args) {
		
		FamilyBankAccount familybankaccount = new FamilyBankAccount();

		FatherThread fh = new FatherThread("Father-Thread",1000, familybankaccount);
		fh.start();
		
		
		SonThread sh = new SonThread("Son-Thread", 3000, familybankaccount);
		sh.start();
		

	}

}
