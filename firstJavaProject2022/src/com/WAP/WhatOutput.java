package com.WAP;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WhatOutput {
	
	public static void main(String[] args) {
		Set myset = new HashSet();
	    for(short i1=0;i1<100;i1++) {
	    	myset.add(i1);
	    	myset.remove(i1-1);
	    }
	    System.out.println(myset.size());
	    
	    //as i1 is short and 1 is integer
	    //so i1-1 will do nothing. so nothing will get removed.
	    //so set size is 100
	    
	    
	    List<Integer> intList =List.of(1,2,3,4,5);
		intList.set(1, 12);
	}
	
	

}
