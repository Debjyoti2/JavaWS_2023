package com.bankatm_using_thread;

public class Runner {
	
	public static void main(String[] args) {
		
		Account ac = new Account();
		AtmThread at1 = new AtmThread(ac,"Kittu",2000);
		at1.start();
		AtmThread at2 = new AtmThread(ac,"Bimal",2000);
		at2.start();
		
		
	}

}
