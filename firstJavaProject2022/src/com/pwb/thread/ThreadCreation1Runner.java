package com.pwb.thread;

public class ThreadCreation1Runner {

	public static void main(String[] args) {

		for(int i=0;i<5;i++) {
//			ThreadCreation1 th1 = new ThreadCreation1();
//			th1.setName("Kittu1");
//			th1.setPriority(5);
//			th1.start();
//			
//			ThreadCreation1 th2 = new ThreadCreation1();
//			th2.setName("Kittu2");
//			th2.start();
			
			//in the abov situation both the thread will starts concurrently , but as Th1 priority is high it will executed by CPU more..
			
			//if now we want to do that th2 should starts only after th1 get completed..
			
			//then we need to use .join() function after th1
			
			ThreadCreation1 th1  = new ThreadCreation1();
			ThreadCreation1 th2 = new ThreadCreation1();
			th1.setName("Kittu1");
			th2.setName("Kittu2");
			
			th1.start();
			try {
				th1.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			th2.start();
			
			
			
		}
		
		

	}

}
