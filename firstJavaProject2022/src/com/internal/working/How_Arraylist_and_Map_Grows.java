package com.internal.working;

public class How_Arraylist_and_Map_Grows {
	
	
	//arraylist
	
	/*
	private static final int DEFAULT_CAPACITY = 10;
	
	so default capacity of arraylist is 10.
	load factor is 0.75 i.e 75%.
	so threashold = 7.
	increase formula  =  size + size/2;
	
	element is getting added in arraylist. after the addtion of 6th element , when 7th element comes for adding
	then arraylist  will extends the 
	size by size + size/2. i.e 10+5  =15.
	
	now the new threashold become  = 15* 0.75 = 12.
   
   */
	
	
	//HashMap
	
	/*
	  
	so default capacity of HashMap is 16.
	load factor is 0.75 i.e 75%.
	so threashold = 12.
	increase formula  =  size*2
	
	once the 12th element put inside HashMap is doubles its size
	16*2 =32 (new size).
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 */
   
}
