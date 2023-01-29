package com.generics.practice;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {
	
	public static void main(String[] args) {
		do_double_or_int_multiplication(1,2);
		do_double_or_int_multiplication(1.2,2.2);
		do_double_or_int_multiplication("A","N");
		
		
		List<Integer> mylist = new ArrayList<>();
		mylist.add(1);
		mylist.add(2);
		printList(mylist);
		
	}
	
	public static <T1,T2>  void do_double_or_int_multiplication(T1 v1, T2 v2) {
		System.out.println(v1 + "  " + v2);
	}
	
	public static void printList(List<? extends Number> list) {
		System.out.println(list);
	}

}
