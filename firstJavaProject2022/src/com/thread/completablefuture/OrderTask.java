package com.thread.completablefuture;

import java.util.concurrent.Callable;

public class OrderTask implements Callable<Order>{
	

	@Override
	public Order call() throws Exception {
		Order neworder= new Order(1,"NEW");
		return  neworder;
	}
}
