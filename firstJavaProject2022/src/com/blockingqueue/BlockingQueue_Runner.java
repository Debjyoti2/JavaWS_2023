package com.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueue_Runner {
	
	public static void main(String[] args) {
		
		BlockingQueue<String> block = new ArrayBlockingQueue<>(5);
		
		Producer p1 = new Producer(block);
		Consumer c1 = new Consumer(block);
		
		p1.start();
		c1.start();
		
	}

}
