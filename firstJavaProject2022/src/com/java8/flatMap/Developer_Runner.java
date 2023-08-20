package com.java8.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Developer_Runner {

	public static void main(String[] args) {

		Developer d1 = new Developer(1, "Debrup","Java 1");
		d1.addBook("Java 2");
		d1.addBook("Java 3");
		d1.addBook("Java 4");
		
		Developer d2 = new Developer(2, "Buddha","Java 5");
		d2.addBook("Java 6");
		
		List<Developer> developers =  new ArrayList<>();
		developers.add(d1);
		developers.add(d2);
		
		
		String booststr = developers.stream().flatMap(e->e.getBook().stream()).collect(Collectors.joining("---"));
		System.out.println("booststr :: " + booststr);
		
		//get only Developer Names in a List<String>
		
		List<String> names2 =developers.stream().map(e->e.getName()).collect(Collectors.toList());
		System.out.println("getting Names using map " + names2);
		
		//getting all the books from the developers by flatmap(List inside list)
		List<String> books = developers.stream().flatMap(e->e.getBook().stream()).collect(Collectors.toList());
		System.out.println("books are :: " + books);
		
		
		//findfirst
		
		List<String> names =  List.of("ABC","Kiran","Jyoti","Bijli");
		String name = names.stream().sorted().filter(e->e.endsWith("i")).findFirst().get();
		System.out.println("Name is : " + name); 
		
		
		//find count of each char in a string
		String str= "abcdeedcabcghtgfhj";
		
		//using Hashmap and java < 1.8
		Map<Character,Integer> countMap =  new HashMap<>();
		for(int i=0;i<str.length();i++) {
			Character c = str.charAt(i);
			if(countMap.containsKey(c)) {
				Integer existing_value = countMap.get(c);
				countMap.replace(c, existing_value+1);
			}
			else {
				countMap.put(c, 1);
			}
		}
		for(Map.Entry<Character,Integer> map : countMap.entrySet()) {
			System.out.println("Char is :: " + map.getKey() + " Count Is :: " + map.getValue());
		}
		
		
		//using java 1.8
		List<String> strList = Arrays.asList(str.split(""));
		Map<String,Long> countMap2 = strList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		for(Map.Entry<String,Long> map : countMap2.entrySet()) {
			System.out.println("By java 1.8 Char is :: " + map.getKey() + " Count Is :: " + map.getValue());
		}
		
	}

}
