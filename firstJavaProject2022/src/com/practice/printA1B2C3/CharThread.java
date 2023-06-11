package com.practice.printA1B2C3;

public class CharThread implements Runnable{
	
	private String thName;
	ThreadExample e;
	
	public CharThread(String thName,ThreadExample e) {
		this.thName=thName;
		this.e=e;
	}

	@Override
	public void run() {
		
		for(char i='a';i<='z';i++){
			e.printchar(i,thName);
		}
		
		
	}
	
}
