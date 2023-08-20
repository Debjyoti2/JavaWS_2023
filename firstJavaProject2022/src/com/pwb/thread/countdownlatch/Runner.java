package com.pwb.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Runner {
	
	public static void main(String[] args) throws InterruptedException {
		
		CountDownLatch latch = new CountDownLatch(3);
		
		MyRunnable r1 = new MyRunnable(latch, "Th-1");
		Thread th1 = new Thread(r1);
		
		MyRunnable r2 = new MyRunnable(latch, "Th-2");
		Thread th2 = new Thread(r2);
		
		MyRunnable r3 = new MyRunnable(latch, "Th-3");
		Thread th3 = new Thread(r3);
		
		
		th1.start();
		th2.start();
		th3.start();
		
		latch.await();
		
		System.out.println("Main thread executed");
		
		
		
	}

}
