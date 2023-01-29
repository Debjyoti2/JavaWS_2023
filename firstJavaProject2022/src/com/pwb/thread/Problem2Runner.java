package com.pwb.thread;

public class Problem2Runner {
	
	public static void main(String[] args) {
		Problem2Thread1 th1 = new Problem2Thread1();
		th1.start();
		
		Problem2Thread2 th2 = new Problem2Thread2();
		th2.start();
	}

}
