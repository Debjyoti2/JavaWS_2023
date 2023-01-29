package com.java8;

import java.util.List;

public class Method_Referance {

	public static void main(String[] args) {

		List<Integer> newList = List.of(1,2,3,4,5,6,7,8,9);
		newList.stream().forEach(e->System.out.println(e));

		newList.stream().forEach(System.out::println); //method reference

		newList.stream().forEach(Method_Referance :: printEachNums); //method reference

	}

	public static void printEachNums(Integer num) {
		System.out.println(num);
	}

}
