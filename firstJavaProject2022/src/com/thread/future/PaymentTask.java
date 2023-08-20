package com.thread.future;

import java.util.concurrent.Callable;

public class PaymentTask implements Callable<Order>{
	
	private int id;
	private String ordersts;
	
	PaymentTask(int id, String ordersts){
		this.id =id;
		this.ordersts=ordersts;
	}
	
	@Override
	public Order call() throws Exception {
		return new Order(id,"PAYMENTDONE");
	}

}
