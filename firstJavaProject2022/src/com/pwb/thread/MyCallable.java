package com.pwb.thread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Long>{
	
	int number;
	
	MyCallable(int number){
		this.number = number;
	}
	
	@Override
	public Long call() throws Exception {
	   long fact=1;
       for(int i=number-1;i>1;i--) {
    	   fact = fact*number;
       }

		return fact;
	}

}
