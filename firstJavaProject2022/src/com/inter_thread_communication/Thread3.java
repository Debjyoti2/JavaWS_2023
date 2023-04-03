package com.inter_thread_communication;

public class Thread3 implements Runnable{

	
	int number;

	Thread3(int number) {
		this.number = number;
	}

	@Override
	public synchronized void run() {

		synchronized (this) {
			while(this.number<11) {
			if (this.number % 3 == 2) {
				this.number++;
				System.out.println("Thread-3 : " + this.number);
				notify();
			} else {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			}

		}

	}
	
}
