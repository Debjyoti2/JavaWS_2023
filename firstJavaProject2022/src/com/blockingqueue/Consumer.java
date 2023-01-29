package com.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread{

	BlockingQueue<String> arrayBlk;
	
	Consumer(BlockingQueue<String> arrayBlk){
		this.arrayBlk=arrayBlk;
	}
	
	@Override
	public void run() {
		while(true) {
			String element="";
			try {
			  element =arrayBlk.take();
			  System.out.println("Element taken :: " + element);
			  Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
}
