package com.pwb.thread.cyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class Runner {
	
	
	
	public static void main(String[] args) {
		CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
		
		MyRunnable r1= new MyRunnable(cyclicBarrier, "Th-1");
		Thread th1 = new Thread(r1);
		
		MyRunnable r2= new MyRunnable(cyclicBarrier, "Th-2");
		Thread th2 = new Thread(r2);
		
		th1.start();
		th2.start();
		
	}

}
