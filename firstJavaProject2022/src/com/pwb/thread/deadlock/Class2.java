package com.pwb.thread.deadlock;

public class Class2 {
	
	public void fun2() {
		
		synchronized (Runner.obj2) {
			
			synchronized (Runner.obj1) {
				
			}
			
		}
		
	}

}
