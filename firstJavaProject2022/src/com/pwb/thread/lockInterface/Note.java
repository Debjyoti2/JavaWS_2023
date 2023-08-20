package com.pwb.thread.lockInterface;

public class Note {
	
	/*
	
 A java.util.concurrent.locks.Lock interface is used to as a thread synchronization mechanism similar to synchronized blocks.
 New Locking mechanism is more flexible and provides more options than a synchronized block.
 Main differences between a Lock and a synchronized block are following −
	
	 Guarantee of sequence − Synchronized block does not provide any guarantee of sequence in
	 which waiting thread will be given access. Lock interface handles it.
	
	 No timeout − Synchronized block has no option of timeout if lock is not granted.
	 Lock interface provides such option.
	
	 Single method − Synchronized block must be fully contained within a single method whereas a
	 lock interface's methods lock() and unlock() can be called in different methods.



   ReentrantLock class is the implementation of lock interface.

*/

}
