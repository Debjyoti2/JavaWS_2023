package com.pwb.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		ArrayList<String> newList = new ArrayList<String>();
		//newList.
		
		List<String> _list = new ArrayList<String>();
		//_list.
		
		
		String[] newArr = new  String[3];
		newArr[0]="A";
		newArr[1]="B";
		newArr[2]="C";
		
		List<String> newList2 = new ArrayList<String>(Arrays.asList(newArr));  
		
		for(String s : newList2) {
			System.out.println("S ::" + s);
		}
		
		ArrayList<String> l2 = new ArrayList<>(Arrays.asList("D","E"));
		l2.addAll(newList2);
		
		for(String s : l2) {
			if(s.contains("A")) {
				System.out.println("Hi Its A");
			}
			System.out.println("S ::" + s);
		}
		
		
	}
	
	
	

}
