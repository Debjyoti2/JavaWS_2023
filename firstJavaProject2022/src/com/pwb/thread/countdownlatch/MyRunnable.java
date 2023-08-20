package com.pwb.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class MyRunnable implements Runnable{
	
	private CountDownLatch latch;
	
	public MyRunnable(CountDownLatch latch, String thName) {
		this.latch =latch;
	}
	
	@Override
	public void run() {

		try
        {
            Thread.sleep(3000);
            latch.countDown();
            System.out.println(Thread.currentThread().getName()
                            + " finished");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
		
		
	}

}
