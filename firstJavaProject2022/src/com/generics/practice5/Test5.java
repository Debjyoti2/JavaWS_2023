package com.generics.practice5;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
	
	public static void print_unboundwildcard(List<?> list) {
		System.out.println(list);
	}
	
	public  static void print_upper_bound_wild_cards(List<? extends Number> list) {//Number ba tar nicher class nbe
		System.out.println(list);
	}
	
	public static void print_lower_bound_wild_cards(List<? super Integer> list) { //Integer ba tar uporer class nbe
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		
		// unbound wildcard
		List<Object> list1 = new ArrayList<>();
		list1.add(1);
		list1.add("123");
		list1.add(true);
		print_unboundwildcard(list1);
		
		
		// upper bound wildcard
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(3);
		print_upper_bound_wild_cards(list2);
		
		List<Double> list3 = new ArrayList<>();
		list3.add(1.2);
		list3.add(3.33);
		print_upper_bound_wild_cards(list3);
		
		
		// lower bound wildcard

		List<Number> list4 = new ArrayList<>();
		list4.add(1);
		list4.add(5);
		print_lower_bound_wild_cards(list4);
		
		//Integer er uporer class Number tai nilo..
		// Integer er parallal class Double nbe na
		
		List<Double> list5 = new ArrayList<>();
		list5.add(2.8);
		list5.add(2.34);
		//print_lower_bound_wild_cards(list5);  nebe na
		
		
	}

}
