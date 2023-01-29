package com.java8.in28Min.Course;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Practice1 {

	public static void main(String[] args) {


		List<String> courses =  List.of("Spring","Springboot","Java","Jsf");
		courses.stream().forEach(e->System.out.println(e));

		courses.stream().filter(e->e.contains("Spring")).forEach(e->System.out.println(e));

		courses.stream().filter(e->e.length()>3).forEach(e->System.out.println(e));

		List<Integer> nums =  List.of(1,2,3,4,5,6,7,8,9,9,9,8);

		nums.stream().map(e->e*e).forEach(e->System.out.println(e));

		//cube of odds
		nums.stream().filter(e->e%2!=0).map(e->e*e*e).forEach(e->System.out.println(e));

		//number of char in each course
		courses.stream().map(e->e.length()).forEach(e->System.out.println(e));
		List<Integer> lengthEach = courses.stream().map(e->e.length()).collect(Collectors.toList());
		System.out.println(lengthEach);

		//sum of numbers by reduce method
		Integer sum = nums.stream().reduce(0,(e1,e2)->e1+e2);
		System.out.println("Sum is :: " + sum);

		//max number
		Integer maxNum = nums.stream().max((e1,e2)->e1.compareTo(e2)).get();
		System.out.println("Max is : " + maxNum);


		//sqr every num and then find sum
		int sqr_and_sum = nums.stream().map(e->e*e).reduce(0,(e1,e2)->e1+e2);
		System.out.println("sqr_and_sum is :: " + sqr_and_sum);

		//sum of the odd num in a list
		int sum_of_odds = nums.stream().filter(e->e%2!=0).reduce(0,(e1,e2)->e1+e2);
		System.out.println("sum_of_odds is :: " + sum_of_odds);

		//distinct num
		List<Integer> distincts = nums.stream().distinct().collect(Collectors.toList());
		System.out.println("distincts is :: " + distincts);

		//sorted in reverse order
		List<Integer> sorteds = nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("sorteds is :: " + sorteds);

		//sorted in str length  order
		List<String> sorteds2 = courses.stream().sorted(Comparator.comparing(e->e.length())).collect(Collectors.toList());
		System.out.println("sorteds is :: " + sorteds2);
		
		
		//funtions of stream which return stream back is called Intermidiate operation
		//like - filter,map,distinct,sorted,
		
		
		//terminal opearation which does not return stream back
		//like - foreach, collect,  reduce,  
		
		
		//filter uses - Predicate FI that return true or false;
		//map uses -  Function FI that does some oprn on the value and return it back;
		//foreach uses - Consumer FI that consume the value and does not return anything;
		
		


	}

}
