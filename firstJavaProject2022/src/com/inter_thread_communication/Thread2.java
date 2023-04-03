package com.inter_thread_communication;

public class Thread2 implements Runnable {

	int number;

	Thread2(int number) {
		this.number = number;
	}

	@Override
	public synchronized void run() {

		synchronized (this) {
			while(this.number<11) {
			if (this.number % 3 == 1) {
				this.number++;
				System.out.println("Thread-2 : " + this.number);
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
