package com.thread.join;

public class ThreadRunner {
	
	public static int counter=0;
	
	public static void main(String[] args) throws InterruptedException {
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		th1.start();
		th2.start();
		//th1.join(); //join () mane age th1 complete hbe then only porer line r code execute hote jbe... mane eta th1 thraed complete hoya porjonto wait korabe.
		//th2.join();
		
		System.out.println("Value is :: " + counter);
	}

}
