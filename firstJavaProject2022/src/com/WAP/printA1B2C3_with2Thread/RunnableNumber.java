package com.WAP.printA1B2C3_with2Thread;

public class RunnableNumber implements Runnable{

	ThreadExample ex;
	String thName;
	RunnableNumber(ThreadExample the,String thName){
		this.ex=the;
		this.thName= thName;
		
	}
	
	@Override
	public void run() {
		for(int i=1;i<=26;i++) {
			ex.printNumber(i,this.thName);
		}
	}
	
}
