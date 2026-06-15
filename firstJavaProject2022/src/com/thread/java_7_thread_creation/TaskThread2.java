package com.thread.java_7_thread_creation;

public class TaskThread2 extends Thread{

	@Override
	public void run() {
		for(int i=10;i<20;i++) {
			System.out.println("From Thread2  ::: "  +i);
		}
	}
}
