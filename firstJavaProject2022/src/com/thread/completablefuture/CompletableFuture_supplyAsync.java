package com.thread.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFuture_supplyAsync {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		businessLogic1();

		// longrunningapicall logic is needed to be execute in background , but i dont
		// want to block
		// main thread .. so we will put api call in CompletebleFuture,,
		// and main thread will go on executing businessLogic2, businessLogic3

		// only businessLogic4 needs the result of longrunningapicall

		// CompletableFuture<Integer> result =
		// CompletableFuture.supplyAsync(()->longrunningapicall());
		CompletableFuture.supplyAsync(() -> longrunningapicall())
				         .thenAccept((result) -> System.out.println("Result is :: " + result));

		businessLogic2();
		businessLogic3();

		// businessLogic4(result.get());

		TimeUnit.SECONDS.sleep(3);

	}

	public static void businessLogic1() {
		System.out.println("businessLogic1");
	}

	public static int longrunningapicall() {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return 5;
	}

	public static void businessLogic2() {
		System.out.println("businessLogic2");
	}

	public static void businessLogic3() {
		System.out.println("businessLogic3");
	}

	public static void businessLogic4(int returnnumfromapicall) {
		System.out.println("businessLogic4   number return from api call " + returnnumfromapicall);
	}

}
