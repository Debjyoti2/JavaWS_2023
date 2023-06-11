package com.WAP.printA1B2C3_with2Thread;

public class RunnableChar implements Runnable{
	
	ThreadExample ex;
	String thName;
	public RunnableChar(ThreadExample the,String thName) {
		this.ex=the;
		this.thName=thName;
	}
	
	@Override
	public void run() {
		for(char i='a';i<='z';i++) {
			ex.printChar(i,thName);
		}
	}
	
	

}
