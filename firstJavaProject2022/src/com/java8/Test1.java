package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test1 {
	
	public static void main(String[] args) {
		List<String> list = List.of("AT","BT","CH","DE");
		List<Integer> list2 = List.of(1,2,3,4,5);
		List<Integer> list3 = List.of(1,2,3,4,5,6,7,8,9,12,32,33,54,2,32,67,89);
		
		printValues(list);
		printValueswithLambda(list);
		printValueswithLambda2(list2);
		printValueswithLambdawithFilter(list);
		printValueswithLambdawithFilter_collect_in_list(list);
		
		sumOfNumbersInaList(list2);
		FilterOddNumberAndAdd(list3);
		sort_a_List(list3);
		excercise(list);
	}
	
	
    public static void printValues(List<String> list) { 
    	for(String s : list) { 
    		System.out.println(s);
    		
    	}
    }
    
    public static void printValueswithLambda(List<String> list) {
    	list.stream().forEach(element-> System.out.println(element));
    }
    
    public static void printValueswithLambda2(List<Integer> list) {
    	list.stream().forEach(element->System.out.println(element));
    	
    }
    public static void printValueswithLambdawithFilter(List<String> list) {
    	list.stream().filter(element -> element.endsWith("T")).forEach(element -> System.out.println(element));
    }
    public static void printValueswithLambdawithFilter_collect_in_list(List<String> list) {
    	List<String> collectList = new ArrayList<>();
    	collectList = list.stream()
    			      .filter(element-> element.endsWith("T"))
    			      .collect(Collectors.toList());
    	
    	System.out.println(collectList);
    }
    
    //sum of numbers in a list
    public static void sumOfNumbersInaList(List<Integer> list2) {
    	int sum = list2.stream().reduce(0,(num1,num2)->num1+num2);
    	System.out.println("sumOfNumbersInaList :: " + sum);
    }
    
    //sum of only numbers from list3
    public static void FilterOddNumberAndAdd(List<Integer> list3) {
    	int sum= list3.stream().filter(e->e%2!=0).reduce(0,(num1,num2)->num1+num2); 
    	System.out.println("FilterOddNumberAndAdd   "  + sum);
    }
    
    
    //sort a list
    public static void sort_a_List(List<Integer> list3) {
    	List<Integer> returnList  = list3.stream().sorted().collect(Collectors.toList());
    	System.out.println("returnList 1::: "  + returnList);
    	returnList = list3.stream().distinct().collect(Collectors.toList());
    	System.out.println("returnList 2::: "  + returnList);
    	
    	//call function on each element
    	list3.stream().distinct().sorted().forEach(e->callFunction(e));
    	
    	//sqr of each element and put in some list
    	returnList = list3.stream().distinct().sorted().map(e->e*e).collect(Collectors.toList());
    	System.out.println("returnList 3::: "  + returnList);
    }


	private static Object callFunction(Integer e) {
		return null;
	}
	
	
	private static void excercise(List<String> list) {
		
		//print sqr of 1st 10 numbers
		IntStream.range(1, 10).sorted().map(e->e*e).forEach(e-> System.out.print("Sqr::  " +e));
		
		//collect sqr of 1st 10 nums in list
		List<Integer> newlist2 =  new ArrayList<>();
		List<Integer> list4 = List.of(1,2,3,4,5);
		newlist2 = list4.stream().map(e->e*e).collect(Collectors.toList());
		newlist2 = IntStream.range(1,11).map(e->e*e).boxed().collect(Collectors.toList()) ;
		System.out.println("newlist2 :: " + newlist2); 
		
		
		//uppercase to lowercase and collect in a List<String>
		List<String> newList = new ArrayList<>();
		list.stream().forEach(e->System.out.println(e.toLowerCase()));
		newList = list.stream().map(e->e.toLowerCase()).collect(Collectors.toList());
		System.out.println(newList);
		
		
		//length of each element
		list.stream().forEach(e->System.out.println("Length :: " + e.length()));
		
		//maxm value of list3
		List<Integer> list3 = List.of(1,2,3,4,5,6,7,8,9,12,32,33,54,2,32,67,89);
		Integer value = list3.stream().max((n1,n2)-> Integer.compare(n1,n2)).get();
		System.out.println("Value is :: " + value);
		
		
		 
	}  	
	 
}
