package com.pwb.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread1_Runner {

	public static void main(String[] args) {
		
		//by using single thread
		//Runnable1 rn1 = new Runnable1("Kittu");
		//Thread th1 = new Thread(rn1);
		//th1.start();
		
		//but if we want to create 50 thread and want to serve 100 req, then 100 time creating new thread is not advisible
		//so in that case use thread pool.
		
		ExecutorService exs = Executors.newFixedThreadPool(50);
		
		for(int i=0;i<100;i++) {
			Runnable1 rn1 = new Runnable1("Kittu + " +  i);
		    exs.execute(rn1);
		}
		exs.shutdown();
		
		

	}

}
