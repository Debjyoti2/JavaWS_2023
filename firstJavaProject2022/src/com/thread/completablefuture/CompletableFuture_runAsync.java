package com.thread.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFuture_runAsync {
	
	public static void main(String[] args) {
		
		businessLogic1();
		
		//postingbulkdatatodb logic is needed to be execute in background by a separate thread, but i dont want to block 
		//main thread .. so we will put api call in CompletebleFuture,, 
		//and main thread will go on executing businessLogic2, businessLogic3,businessLogic4
		
		
		
		CompletableFuture.runAsync(()->postingbulkdatatodb());
		
		businessLogic2();
		businessLogic3();
		
		
		businessLogic4();
		
		
		
	}

	
	public static void businessLogic1() {
		System.out.println("businessLogic1");
	}
	
	public static void postingbulkdatatodb() {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("postingbulkdatatodb");
	}
	
	public static void businessLogic2() {
		System.out.println("businessLogic2");
	}
	public static void businessLogic3() {
		System.out.println("businessLogic3");
	}
	public static void businessLogic4() {
		System.out.println("businessLogic4");
	}
	
}
