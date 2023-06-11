package com.practice.printA1B2C3;

public class ThreadExample {
	
	private Object lock = new Object();
	private String state="CHAR";
	
	public void printchar(char cha, String thName) {
		synchronized (lock) {
			while(true){
				if(state=="CHAR") {
					System.out.println(cha + " from thread " + thName);
					state="NUMBER";
					lock.notify();
					return;
				}
				else {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
			
		}
		
	}
	
	public void printNumber(int i, String thName) {
		synchronized (lock) {
			while(true){
				if(state=="NUMBER") {
					System.out.println(i + " from thread " + thName);
					state="CHAR";
					lock.notify();
					return;
				}
				else {
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
