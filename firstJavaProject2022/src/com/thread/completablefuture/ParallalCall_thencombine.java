package com.thread.completablefuture;

import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class ParallalCall_thencombine {

	public static void main(String[] args) {

		ParallalCall_thencombine obj = new ParallalCall_thencombine();

		System.out.println("Start :: " + LocalDateTime.now());

		CompletableFuture<String> helloc = CompletableFuture.supplyAsync(() -> obj.hello())
				.thenApply(e -> e.toUpperCase());

		CompletableFuture<String> worldc = CompletableFuture.supplyAsync(() -> obj.world())
				.thenApply(e -> e.toUpperCase());

		String result = helloc.thenCombine(worldc, (e1, e2) -> e1 + e2).join();

		System.out.println("Result :: " + result);

		System.out.println("Start :: " + LocalDateTime.now());

		// if we do normal sync call
		
//		System.out.println("Start :: " + LocalDateTime.now());
//
//		String hello = obj.hello();
//		String world = obj.world();
//		String result2 = hello + world;
//		System.out.println("Result :: " + result2);
//
//		System.out.println("Start :: " + LocalDateTime.now());
	}

	public String hello() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Hello";

	}

	public String world() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "World";

	}

}
