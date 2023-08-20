package com.thread.callable_and_Future;

public class Notes {
	
	/*
	 
	if we need and output from every task submitted by a Excutor service/ thread pool
	then we need to implement callable interface, bcs runnable interface does not return any value.
	
	executors.execute()// takes only runnable
	
	executors.submit() // takes both callable and runnable
	// if we pass a callble object its return a Future object.
	
	Future is nothing but a placeholder. 
	as soon as we call executors.submit(callableObj) it will return a empty Future object.
	
	and once the execution is done and result is ready it puts the value in Future object.
	
	we can get the value by future.get();
	
	Future<Integer> future = executors.submit(callableObj);
	
	Integer value = future.get();





	 */
	
	

}
