package com.thread.completablefuture;

import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;

public class Class2 {
	
	public static void main(String[] args) {
		
		
		System.out.println("Thread Name : " + Thread.currentThread().getName() + " work 1 started on " + LocalDateTime.now() );
		
		
		//veryLongIoNetworkCall();
        //now this will become a async call . will not block main thread
		//2 methods
		//CompletableFuture.runAsync(null); will not give any o/p. only run in parallal thread
		//CompletableFuture.supplyAsync(null); will also give o/p after execution
		
		CompletableFuture.runAsync(()->veryLongIoNetworkCall());
		
		System.out.println("Thread Name : " + Thread.currentThread().getName() + " work 1  Ended on " + LocalDateTime.now());
		
		System.out.println("Thread Name : " + Thread.currentThread().getName() + "  Work 2 Started " + LocalDateTime.now());
		
	}

	
	public static void sleepForTime(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void veryLongIoNetworkCall() {
		try {
			System.out.println("veryLongIoNetworkCall  :  Thread Name : " + Thread.currentThread().getName() + "  started on " + LocalDateTime.now() );
			Thread.sleep(4000);
			System.out.println("veryLongIoNetworkCall : Thread Name : " + Thread.currentThread().getName() + "  Ended on " + LocalDateTime.now());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
