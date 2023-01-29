package com.pwb.synchronized_keyword;

public class Example1_Runner {
	
	public static void main(String[] args) throws InterruptedException {
		
		Example1 r = new Example1();
		
		Thread th1 = new Thread(r);
		th1.start();
		Thread th2 = new Thread(r);
		th2.start();
		
		th1.join();
		th2.join();
		
		System.out.println(r.getCounter());
		
		
	}

}
