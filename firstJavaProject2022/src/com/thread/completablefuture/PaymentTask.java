package com.thread.completablefuture;

import java.util.concurrent.Callable;

public class PaymentTask implements Callable<Order>{
	
	private Order order;
	
	PaymentTask(Order order){
		this.order =order;
	}
	
	@Override
	public Order call() throws Exception {
		return new Order(this.order.getId(),"PAYMENTDONE");
	}

}
