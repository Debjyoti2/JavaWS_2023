package com.generics;

import java.util.ArrayList;
import java.util.List;

public class NeedOfGenerics {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);

		Integer a= (Integer) list.get(0); //special typecast is required
		
		List<Integer> list2 = new ArrayList();
		list2.add(1);
		Integer b=list2.get(0); //special typecast not required with Generics telling List type will be and <Integer>
		
		
	}
	
	
}
