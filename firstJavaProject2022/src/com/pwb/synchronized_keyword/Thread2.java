package com.pwb.synchronized_keyword;

public class Thread2 extends Thread{
	
	public synchronized void run() {
		for(int j=0;j<1000;j++) {
			ThreadRunner.i--;
			System.out.println("from thread 2 :"  +ThreadRunner.i);
		}
	}

}
