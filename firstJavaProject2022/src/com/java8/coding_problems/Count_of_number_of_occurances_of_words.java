package com.java8.coding_problems;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count_of_number_of_occurances_of_words {

	public static void main(String[] args) {
		
		String str = "welcome to code decode and code decode welcome you";
		String[] strArray = str.split(" ");
		List<String> strList = List.of(strArray);
		
		Map<String,Long> countMap = strList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(countMap);
		
		
	}
	
	
}
