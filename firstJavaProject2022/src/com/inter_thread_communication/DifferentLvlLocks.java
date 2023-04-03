package com.inter_thread_communication;

public class DifferentLvlLocks {

	// Example of Class Level Lock
	public void classLevelLockMethod() {
		synchronized (DifferentLvlLocks.class) {
			// DO your stuff here
		}
	}

	
	
	
	// Example of Object Level Lock
	public void objectLevelLockMethod() {
		synchronized (this) {
			// DO your stuff here
		}
	}

}
