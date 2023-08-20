package com.thread.completablefuture;

import java.util.concurrent.Callable;

public class DispatchOrderTask implements Callable<Order>{
	
	private Order order;
	
	DispatchOrderTask(Order order){
		this.order =order;
	}
	
	@Override
	public Order call() throws Exception {
		return new Order(this.order.getId(),"DISPATCHED");
	}

}
