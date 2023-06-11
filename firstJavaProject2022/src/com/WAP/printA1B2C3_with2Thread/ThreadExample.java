package com.WAP.printA1B2C3_with2Thread;

public class ThreadExample {

	private Object lock = new Object();
	private String state = "CHAR";

	public void printChar(char character,String thName) {
		synchronized (lock) {
			while (true) {
				if (state.equalsIgnoreCase("CHAR")) {
					System.out.println(thName+":: " + character);
					state = "NUMBER";
					lock.notify();
					return;
				} else {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		}
	}

	public void printNumber(int number,String thName) {
		synchronized (lock) {
			while (true) {
				if (state.equalsIgnoreCase("NUMBER")) {
					System.out.println(thName+":: " + number);
					state = "CHAR";
					lock.notify();
					return;
				} else {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		}
	}

}
