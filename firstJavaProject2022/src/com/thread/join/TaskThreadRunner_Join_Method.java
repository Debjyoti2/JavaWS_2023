package com.thread.join;

public class TaskThreadRunner_Join_Method {

	public static void main(String[] args) throws InterruptedException {

		TaskThread1 th1 = new TaskThread1();
		th1.start();
		th1.join(); //joto khon na th1 complete hocche ei line e hold hye jbe... th1 complete hole th1.join() er lock khule jbe.
		
		
		TaskThread2 th2 = new TaskThread2();
		th2.start();
		th2.join();
		
		
		for(int j=30;j<40;j++) {
			System.out.println("From main method : " + j);
		}

		

	}

}
