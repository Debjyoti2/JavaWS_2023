package com.thread.future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Class1 {
	
	public static void main(String[] args) {
		
	ExecutorService excExecutorService =  Executors.newFixedThreadPool(10);
	
	 try {
		 
		 Future<Order> future1 = excExecutorService.submit(new OrderTask(1,"ORDERED"));
		 Order order1 = future1.get();
		 
		 //get call korlei main thread block hoye jay
		 // so 1 ta thread e jotokhon na result asche main therad block thake
		 //this is the problem of Future
		 
		 Future<Order> future2 =  excExecutorService.submit(new EnrichOrderTask(order1.getId(), order1.getOrderSts()));
		 Order order2 = future2.get();
		 
		 Future<Order> future3 =  excExecutorService.submit(new PaymentTask(order1.getId(), order1.getOrderSts()));
		 Order order3 = future3.get();
		 
		 Future<Order> future4 =  excExecutorService.submit(new PaymentTask(order1.getId(), order1.getOrderSts()));
		 Order order4 = future4.get();
		 
		 
		 
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
		
		
	}

}
