package com.java8.coding_problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Find_duplicate_element_in_a_integer_list {

	public static void main(String[] args) {

		List<Integer> intList =  Arrays.asList(1,2,3,4,5,5,4,3,2,2,3);
//		Map<Integer,Long> intMap =  intList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		for(Map.Entry<Integer,Long> map : intMap.entrySet()) {
//			if(map.getValue()>1) {
//				System.out.println("Duplicate entries are :: " + map.getKey());
//			}
//		}
		
		//by pure java 8
		Set<Integer> duplicateElement = new HashSet<>();	
		//intList.stream().filter(e->!duplicateElement.add(e)).collect(Collectors.toSet()).forEach(e->System.out.println(e));
		intList.stream().filter(e->!duplicateElement.add(e)).collect(Collectors.toSet()).forEach(e->System.out.println(e));

		Set<Integer> set1 = new HashSet<>();
		intList.stream().filter(e->!set1.add(e)).collect(Collectors.toSet());
		//System.out.println(set1);
	}

}
