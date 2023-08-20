package com.pwb.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallableRunner {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		MyCallable c = new MyCallable(5);
		
		ExecutorService ex = Executors.newFixedThreadPool(2);
		Future<Long> result = ex.submit(c);
		long value = result.get();
		System.out.println(value);
		
		
		// submit method return a future object
		// so for callable if we except a return value use submit()
		
		// execute() does not return a value
		// so better to use it for runnable
		// ex.execute(null); for runnable object
		
	}

}
