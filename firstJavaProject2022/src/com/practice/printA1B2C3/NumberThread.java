package com.practice.printA1B2C3;

public class NumberThread implements Runnable{

	private String thName;
	ThreadExample e;
	
	public NumberThread(String thName,ThreadExample e) {
		this.thName=thName;
		this.e=e;
	}
	
	
	@Override
	public void run() {
		for(int i=0;i<27;i++) {
			e.printNumber(i,thName);
		}
	}
	
	
}
