package com.thread.java_7_thread_creation;

public class Thread1 extends Thread {

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
            synchronized (ThreadRunner.class) {
            	ThreadRunner.counter++;
            	System.out.println("From Thread1 :: " + ThreadRunner.counter);
			} 
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
