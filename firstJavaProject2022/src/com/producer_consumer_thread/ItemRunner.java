package com.producer_consumer_thread;

public class ItemRunner {

	public static void main(String[] args) {
		
		Item item = new Item();
		
		ItemThread th1= new ItemThread("Thread-1",item);
		th1.start();
		
		ItemThread th2 = new ItemThread("Thread-2",item);
		th2.start();
		
	}

}
