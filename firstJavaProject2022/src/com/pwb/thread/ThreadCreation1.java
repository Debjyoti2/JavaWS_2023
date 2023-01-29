package com.pwb.thread;

public class ThreadCreation1 extends Thread{

	//thread creation by extending Thread class of java.

	
	@Override
	public void run() {
		
		int i=20;
		while(i>0) {
			try {
				System.out.println("Thread is running for thread : " + Thread.currentThread().getId() + "   is running.. Name :: " + Thread.currentThread().getName());
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			i--;
		}
		

	}


}
