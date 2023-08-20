package com.thread.future;

import java.util.concurrent.Callable;

public class DispatchOrderTask implements Callable<Order>{
	
	private int id;
	private String ordersts;
	
	DispatchOrderTask(int id, String ordersts){
		this.id =id;
		this.ordersts=ordersts;
	}
	
	@Override
	public Order call() throws Exception {
		return new Order(id,"DISPATCHED");
	}

}
