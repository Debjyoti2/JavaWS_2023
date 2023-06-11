package com.internal.working;

import java.util.HashSet;
import java.util.Set;

public class HashSet_internal_working {

	//HashSet internally uses HashMap
	
	public static void main(String[] args) {
		
		Set<String> mySet = new HashSet<String>();
		mySet.add("ABC");
		mySet.add("DEF");
		mySet.add("EFG");
	}
	
	
	/*
	 *
	 
	 HashSet intrenally uses HashMap only
	 
	  private static final Object PRESENT = new Object();
	 
	 set.add("A");   it executes internally  map.put("A", PRESENT);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 */
	
	
}
