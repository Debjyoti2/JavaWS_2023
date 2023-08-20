package com.thread.future;

import java.util.concurrent.Callable;

public class OrderTask implements Callable<Order>{
	
	private int id;
	private String ordersts;
	
	OrderTask(int id, String ordersts){
		this.id =id;
		this.ordersts=ordersts;
	}

	@Override
	public Order call() throws Exception {
		return new Order(id,ordersts);
	}
}
