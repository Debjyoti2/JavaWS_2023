package com.thread.practice;

public class TaskThread1 extends Thread{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread 1 ::  " + i);
		}
	}
	
}
