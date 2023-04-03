package com.inter_thread_communication;

public class Thread1 implements Runnable {

	int number;

	Thread1(int number) {
		this.number = number;
	}

	@Override
	public synchronized void run() {

		synchronized (this) {
			while (this.number < 11) {
				if (this.number % 3 == 0) {
					this.number++;
					System.out.println("Thread-1 : " + this.number);
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
