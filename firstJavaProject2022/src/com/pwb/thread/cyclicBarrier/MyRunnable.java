package com.pwb.thread.cyclicBarrier;

import java.time.LocalDateTime;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyRunnable implements Runnable{
	
	private CyclicBarrier cyclicBarrier;
	private String thName;
	
	MyRunnable(CyclicBarrier cyclicBarrier, String thName){
		this.cyclicBarrier=cyclicBarrier;
		this.thName =thName;
	}
	
	@Override
	public void run() {
		
		try {
			this.cyclicBarrier.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
		
		System.out.println("Now Execute " + LocalDateTime.now() +  this.thName);
		
	}

}
