package com.pwb.synchronized_keyword;

public class ThreadRunner {
	
	public static  int i=0;
	
	public static void main(String[] args) throws InterruptedException {
		Thread1 th1 = new Thread1();
		th1.start();
		Thread2 th2 = new Thread2();
		th2.start();
		th1.join();
		th2.join();
		
		System.out.println("value of i ::" + i);
	}
	
	
	

}
