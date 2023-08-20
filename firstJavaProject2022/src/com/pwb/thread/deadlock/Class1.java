package com.pwb.thread.deadlock;

public class Class1 {
	
	public void fun() {
		
		synchronized (Runner.obj1) {
			
			synchronized (Runner.obj2) {
				
			}
			
		}
		
		
		
	}

}
