package com.pwb.thread;

public class Diff_Btwn_Runnable_Callable_Interface {

	//Runnable interface to create a runnable object , then override th run method
	//then pass the runnable object in a thread constructor to create a thread
	
	//but that run method do not have any return type..
	
	//so if we want to runa a thread job and in every iteration we want to return a value 
	//then we should use callable interface ..
	//but callable inrterface we cant pass in thread class as in constructor
	
	// so here we hv to create a Executor service and hv to pass callable interface 
	// in executor service
	
	
	
	
}
