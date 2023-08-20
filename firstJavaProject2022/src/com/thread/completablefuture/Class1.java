package com.thread.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Class1 {

	public static void main(String[] args) {


		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		/*
		
		CompletableFuture.supplyAsync(()->new OrderTask())
		.thenApplyAsync((order) -> new EnrichOrderTask(order))
		.thenApplyAsync((order) -> new PaymentTask(order))
		.thenApplyAsync((order) -> new DispatchOrderTask(order));
		
		
		*/

	}

}
