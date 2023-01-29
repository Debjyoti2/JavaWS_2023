package com.thread.join;

public class Thread1 extends Thread{

	@Override
	public void run() {
		for(int i=0;i<10000;i++) {
			counterIncrease();
			
		}
	}
	
	public synchronized void counterIncrease() {
		ThreadRunner.counter++;
	}
	
}
