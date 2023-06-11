package com.WAP.print_alternate_num_from2Thread;

public class ThreadClass {
	
	public Object lock = new Object();
	
	public void printOdd(int i,String thName) {
		synchronized (lock) {
			while(true) {
				if(i%2!=0) {
					System.out.println(thName+" : " +i);
					lock.notify();
					return;
				}else {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
			
		}
	}
	
	public void printEven(int i,String thName) {
		synchronized (lock) {
			while(true) {
				if(i%2==0) {
					System.out.println(thName+" : " +i);
					lock.notify();
					return;
				}else {
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
