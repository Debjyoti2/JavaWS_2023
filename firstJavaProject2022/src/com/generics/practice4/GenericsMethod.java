package com.generics.practice4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GenericsMethod {
	
	public static <T> List<T> fromArraystoList(T[] a) {
		return Arrays.stream(a).collect(Collectors.toList());
	}

	
	public static <T extends Number> List<T> arraysToListwithUpperBound(T[] a) {
		return Arrays.stream(a).collect(Collectors.toList());
	}
	
	
	public static void main(String[] args) {
		Integer[] intarray= {1,2,3,4,5};
		System.out.println(arraysToListwithUpperBound(intarray));
		
		String[] strarray = {"A","B","C","D"};
		System.out.println(fromArraystoList(strarray));
		
	}
}
