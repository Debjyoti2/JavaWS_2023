package com.WAP.printA1B2C3_with2Thread;

public class Runner {
	
	public static void main(String[] args) {
		ThreadExample e = new ThreadExample();
		
		Thread th1 = new Thread(new RunnableChar(e,"Thread-1"));
		Thread th2 = new Thread(new RunnableNumber(e,"Thread-2"));
		th1.start();
		th2.start();
		
	}

}
