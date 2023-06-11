package com.WAP.print_alternate_num_from2Thread;

public class RunnableEven implements Runnable{

	String thName;
	ThreadClass ex;
	RunnableEven(String thName,ThreadClass ex){
		this.thName=thName;
		this.ex=ex;
		
	}
	
	@Override
	public void run() {
		for(int i=1;i<20;i++) {
			ex.printEven(i,thName);
		}
	}
	
}
