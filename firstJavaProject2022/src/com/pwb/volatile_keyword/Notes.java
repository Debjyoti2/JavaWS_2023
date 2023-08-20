package com.pwb.volatile_keyword;

public class Notes {
	
	/*
	
	volatile means taking variable from RAM directly not from the cache.
	
	In a multithreaded env multiple thraad read/write on a shared resources.
	so in that case we need synchronized block..
	but to ensure that the variable value does not comes out from cache memory but from RAm, we can use volatile keyword in a variable.
	
	
	private volatile String name;
	
	
	
	Volatile keyword establishes that all the reads to the Volatile variable has happened before the write operation.
	Volatile guarantees that every thread would see the most updated value for a variable which has been declared as Volatile.
	Volatile guarantees that the value of a Volatile variable is directly reread from the main memory before we use it.
	Volatile makes sure that value written by a thread is always flushed to the main memory before the byte code instruction completes.
	Volatile is not equivalent to synchronizing a critical section as Volatile does not involve any Locking.
	The key point about the Volatile is that it allows for only one operation on the memory location which will be immediately flushed to the main memory.
	The Volatile is hardware access mode and produces a CPU instruction that says to ignore the cache hardware and instead read or write to the main memory.
	
	
	
	
	
	
	
	
	
	*/
	

}
