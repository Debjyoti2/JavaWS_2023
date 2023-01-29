package com.thread.practice;

public class Thread2  extends Thread{

	@Override
	public void run() {
		for(int i=101;i<200;i++) {
			synchronized (ThreadRunner.class) {
				ThreadRunner.counter--;
				System.out.println("From Thread2 :: " + ThreadRunner.counter);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
