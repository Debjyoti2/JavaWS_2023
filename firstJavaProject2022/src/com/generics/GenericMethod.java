package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {
	
	
	public static <T extends Object> List<T> duplicateList(List<T> list){
		list.addAll(list);
		return list;
	}

	
	public static void main(String[] args) {
		List<String> myStrList = new ArrayList<>();
		List<String> myStrListReturn = new ArrayList<>();
		myStrList.add("A");
		GenericMethod gm = new GenericMethod();
		myStrListReturn=gm.duplicateList(myStrList);
		System.out.println(myStrListReturn.toArray().toString());
	}
}
