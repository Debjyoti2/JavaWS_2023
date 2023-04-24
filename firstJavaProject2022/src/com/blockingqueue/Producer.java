package com.blockingqueue;

import java.time.LocalDateTime;
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
			String element ="&&&"  + i++;
			try {
				arrayBlk.put(element);
				System.out.println("Puttted  an element :  " + element);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	

}
