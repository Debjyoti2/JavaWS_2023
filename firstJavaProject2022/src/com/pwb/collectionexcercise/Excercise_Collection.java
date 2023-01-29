package com.pwb.collectionexcercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Excercise_Collection {

	public static void main(String[] args) {

		
		//1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
		ArrayList<String> colours = new ArrayList<String>();
		colours.add("Red");
		colours.add("Blue");
		for(String s : colours) {
			System.out.println("Colours are ::" + s);
		}
		
		//3. Write a Java program to insert an element into the array list at the first position.
		ArrayList<String> _list1 = new ArrayList<String>();
		_list1.add("A");
		_list1.add("B");
		_list1.add(0,"A1");
		for(String s : _list1) {
			System.out.println("Char are ::" + s);
		}
		
		
		//11. Write a Java program to reverse elements in a array list.
		Collections.reverse(_list1);
		for(String s : _list1) {
			System.out.println("Char are ::" + s);
		}
		
		//Q16 Write a program to iterate the HashMap ?
		Map<String,Integer> _map1 = new HashMap<String,Integer>();
		_map1.put("A", 2);
		_map1.put("B",5);
		_map1.put("C",10);

		Set<String> _set1 = new HashSet<String>();
		_set1 = _map1.keySet();
		for(String s : _set1) {
			System.out.println("Elements are :  " +  s + " values : " + _map1.get(s) );
		}
		
		
		//Q17 Write a program to sort HashMap by keys ?
		Map<String,Integer> _map2 = new TreeMap<String,Integer>();
		_map2.put("A",1);
		_map2.put("Z", 26);
		_map2.put("D",4);
		System.out.println(_map2);
		
		//Q18 Write a program to sort ArrayList using Comparator?
		Person p1 = new Person("AB",100);
		Person p2 = new Person("ZA",100);
		Person p3 = new Person("CD",100);
		ArrayList<Person> _list3 = new ArrayList<Person>();
		_list3.add(p1);
		_list3.add(p2);
		_list3.add(p3);
		for(Person p : _list3) {
			System.out.println("Person : " + p.getName() + p.getPhone());
		}
		Collections.sort(_list3,new PersonNameComparator());
		for(Person p : _list3) {
			System.out.println("Sorting Person : " + p.getName() + p.getPhone());
		}

	}

}
