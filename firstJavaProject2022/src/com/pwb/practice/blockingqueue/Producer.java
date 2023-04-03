package com.pwb.practice.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Producer extends Thread{
	
	ArrayBlockingQueue<String> blckq =  new ArrayBlockingQueue<String>(1);
	Producer(ArrayBlockingQueue<String> blckq){
		this.blckq=blckq;
	}
	
	@Override
	public void run() {
		int i=0;
		while(true) {
			try {
				this.blckq.put("BLK" + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
			
		}
	}

}
