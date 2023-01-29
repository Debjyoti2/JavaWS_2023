package com.producer_consumer_thread;

public class ItemThread extends Thread{
	
	Item item;
	String thName;
	
	ItemThread(String thName,Item item){
		this.thName =thName;
		this.item =item;
	}

	@Override
	public void run() {
		synchronized(this) {
			for(int i=0;i<10;i++) {
				if("Thread-1".equalsIgnoreCase(thName)) {
					try {
						item.produceItem(thName);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				else {
					try {
						item.consumeItem(thName);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		
		
	}
	
}
