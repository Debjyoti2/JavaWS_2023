package com.thread.callable_and_Future;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableTaskRandomNumber implements Callable<Integer>{
	
	@Override
	public Integer call() throws Exception {
		return new Random().nextInt();
	}

}
