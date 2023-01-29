package com.pwb.synchronized_keyword;

public class Example1 implements Runnable{
	
	private int counter;
	
	public int getCounter() {
		return counter;
	}
	
	@Override
	public void run() {
	   	for(int i=0;i<10000;i++) {
	   		synchronized (this) {
	   			this.counter++;
			}
	   		
	   	}
	}

}
