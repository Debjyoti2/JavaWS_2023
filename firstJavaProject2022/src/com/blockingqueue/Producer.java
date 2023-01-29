package com.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread{
	
	BlockingQueue<String> arrayBlk;
	
	Producer(BlockingQueue<String> arrayBlk){
		this.arrayBlk=arrayBlk;
	}
	
	@Override
	public void run() {
		int i=0;
		while(true) {
			String timeNow =System.currentTimeMillis() +"&&&"  + i++;
			try {
				arrayBlk.put(timeNow);
				System.out.println("Puttted  an element :  " + timeNow);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	

}
