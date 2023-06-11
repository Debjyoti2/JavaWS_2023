package com.pwb.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IdentityHashMap {

	/*
	in IdentityHashMap we are using == memory location reference while putting a key.
			but in hashmap we chk .equals while putting key.
			
	*/
			
	public static void main(String[] args) {
		Integer i =new Integer(100);
		Integer j =new Integer(100);
		
		Map<Integer,String> myhashmap = new HashMap<>();
		myhashmap.put(i,"INDIA");
		myhashmap.put(j,"US");
		
		//for value its chks .equals() method . as key content is same so it updates value
		System.out.println("myhashmap length :: " + myhashmap.size());
		
		
		Map<Integer,String> myidhashmap = new java.util.IdentityHashMap<>();
		myidhashmap.put(i,"INDIA");
		myidhashmap.put(j,"US");
		//for value its chks == method . as key is present in diferrent memory
		//location so it treats key as diff, so it will not update the value.
	    System.out.println("myhashmap length :: " + myhashmap.size());
	    
	    
	    
		
	}
	
	
	
}
