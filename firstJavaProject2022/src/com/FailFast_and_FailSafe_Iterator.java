package com;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFast_and_FailSafe_Iterator {
	
	// to iterate any collection we need iterator.
	//iterator r basically 2 types . 
	//fail fast iterator -- which does not allow concurrent modification and throw concurrent modification exception (like iterator used in list, set, map)
	//fail safe iterator -- which allow concurrent modification ( like concurrenthashmap , copyonwritearraylist) 
	
	
	
	
	
	public static void main(String[] args) {
		
		
		//fail fast approach
		
		/*
		
		List<String> strList = new ArrayList<>();
		strList.add("A");
		strList.add("B");
		strList.add("C");
		
		//Exception in thread "main" java.util.ConcurrentModificationException
		for(String s : strList) {
			if(s.equals("A")) {
				strList.remove(s);
			}
		}
		
		System.out.println(strList);
		
		
		*/
		
		
		//fail safe approach
		
		//to overcome this
		
		CopyOnWriteArrayList<String> strList2 = new CopyOnWriteArrayList<>();
		strList2.add("A");
		strList2.add("B");
		strList2.add("C");
		
		//Exception in thread "main" java.util.ConcurrentModificationException
		for(String s : strList2) {
			if(s.equals("A")) {
				strList2.remove(s);
			}
		}
		
		System.out.println(strList2);
		
	}
	
	
	

}
