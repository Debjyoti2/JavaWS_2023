package com.thread.volatileKeyword;

public class MyThread extends Thread{

	private int counter=0;
	private volatile boolean isCounting = true;
	
	@Override
	public void run() {
		while(isCounting) {
			counter++;
			System.out.println("Current value of Counter is :: " + counter);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} 
	
	public void stopCounting() {
		isCounting=false;
	}
	
}
