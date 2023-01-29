package com.pwb.map;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {
	
	public static void main(String[] args) {
		Map<String,Integer> myMap = new HashMap<>();
		myMap.put("A",1);
		myMap.put("B",2);
		myMap.put("C",3);
		myMap.put("D",4);
		
		//iterate map 
		for(Map.Entry<String,Integer> mp : myMap.entrySet()) {
			System.out.println(mp);
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		
	}

}
