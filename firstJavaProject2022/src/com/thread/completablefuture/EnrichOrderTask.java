package com.thread.completablefuture;

import java.util.concurrent.Callable;

public class EnrichOrderTask implements Callable<Order>{
	
	private Order order;
	
	EnrichOrderTask(Order order){
		this.order =order;
	}
	
	@Override
	public Order call() throws Exception {
		return new Order(this.order.getId(),"ENRICHED");
	}

}
