package com.producer_consumer_thread;

public class Item {

	private String itemName;
	private int itemCount=0;
	private boolean flag=false;

	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public synchronized void produceItem(String thName) throws InterruptedException {
		if(!flag) {
			this.itemCount++;
			System.out.println("Item Produced by Thread ::" + thName + " Item Count now is : " + itemCount);
			flag=true;
			notify();
		}else {
			wait();
		}
	}
	public synchronized void consumeItem(String thName) throws InterruptedException {
		if(flag) {
			this.itemCount--;
			System.out.println("Item Consume by Thread ::" + thName + " Item Count now is : " + itemCount);
			flag=false;
			notify();
		}else {
			wait();
		}

	}

}
