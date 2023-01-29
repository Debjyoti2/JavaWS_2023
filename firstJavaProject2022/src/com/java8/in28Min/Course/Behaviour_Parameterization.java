package com.java8.in28Min.Course;

import java.util.List;
import java.util.function.Function;

public class Behaviour_Parameterization {

	public static void main(String[] args) {

		List<Integer> numbers =  List.of(1,2,3,4,5,6,7,8,9);
		
		mapNumbersToOther(numbers, e-> e*4);
		mapNumbersToOther(numbers, e-> e*2);
		

	}
	
	public static void mapNumbersToOther(List<Integer> numbers, Function<Integer,Integer> functions) {
		numbers.stream().map(functions).forEach(e->System.out.println(e));
	}

}
