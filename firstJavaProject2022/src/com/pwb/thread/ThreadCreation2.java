package com.pwb.thread;

public class ThreadCreation2 implements Runnable{
	//thread creation by implementing Runnable interface.	
	
	//thread starts its lifecycle inside run method.
	@Override
	public void run() {
	  System.out.println("Thread started ::" + Thread.currentThread().getId() + "  started");
		
	}
	

	
	

}
