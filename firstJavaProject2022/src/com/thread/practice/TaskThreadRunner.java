package com.thread.practice;

public class TaskThreadRunner {

	public static void main(String[] args) throws InterruptedException {

		TaskThread1 th1 = new TaskThread1();
		th1.start();

		TaskThread2 th2 = new TaskThread2();
		th2.start();


		th1.join();
		th2.join();
		for(int j=30;j<40;j++) {
			System.out.println("From main method : " + j);
		}




	}

}
