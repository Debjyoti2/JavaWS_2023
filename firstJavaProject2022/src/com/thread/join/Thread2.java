package com.thread.join;

public class Thread2 extends Thread{
	
	@Override
	public void run() {
		for(int j=0;j<10000;j++) {
			counterIncrease();
		}
	}
	
	public synchronized void counterIncrease() {
		ThreadRunner.counter++;
	}

}
