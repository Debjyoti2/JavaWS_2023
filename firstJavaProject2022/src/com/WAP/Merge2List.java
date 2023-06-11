package com.WAP;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Merge2List {
	
	
	public static void main(String[] args) {
		
		List<Integer> list1 = List.of(1,2,3,4,5);
		List<Integer> list2 = List.of(5,7,3,2,0);
		
		List<Integer> list3 = Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
		
		System.out.println(list3);
				
		
		List<Integer> list4 = list3.stream().distinct().collect(Collectors.toList());
		System.out.println(list4);
		
		
		Map<String,Integer> mymap = new HashMap<>();
		mymap.put("A",21);
		mymap.put("C",51);
		mymap.put("D",51);
		List<String> keyList = mymap.entrySet().stream().map(e->e.getKey()).collect(Collectors.toList());
		List<Integer> valueList = mymap.entrySet().stream().map(e->e.getValue()).collect(Collectors.toList());
		System.out.println(keyList);
		System.out.println(valueList);
	}

}
