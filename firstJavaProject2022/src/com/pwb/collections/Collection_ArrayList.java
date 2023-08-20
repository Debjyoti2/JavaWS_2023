package com.pwb.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class Collection_ArrayList {
	
	public void  addElement() {
		//arraylist is a mutable object , i can add element always
		ArrayList<String> newList = new ArrayList<String>();
		newList.add("Kittu");
		newList.add("Amit");
		
		
		int size = newList.size();
		System.out.println("Size is : " + size);
		
		boolean isEmpty = newList.isEmpty();
		System.out.println("isempty  : "  + isEmpty);
		
		String secondndPos = newList.get(1);
		System.out.println("2nd pos is : "  + secondndPos);
		
		boolean isContain = newList.contains("Amit");
		System.out.println("is contain is : "  +isContain);
		
		int indexOfPresent = newList.indexOf("Amit");
		System.out.println("indexOfPresent :: " + indexOfPresent);
		
		int indexOfNotPresent = newList.indexOf("Pipo");
		System.out.println("indexOfNotPresent is ::: " + indexOfNotPresent);
		
		newList.add(0,"Rahul");
		
		for(int i=0;i<newList.size();i++) {
			System.out.println(newList.get(i));
		}
		
		
		//newList.clear(); clear method empty all content in any type of collections may be list, map,set etc....
		
		
		
		System.out.println("<>>>>>>>>>>>>>>>>>>>>>>>List<>>>>>>>>>>>>>>>>>>>>>");
		
		//list is a immmutable object, cant add element once created
		List<String> immutableList = List.of("Amit", "Kunal");
		//immutableList.add("Bimal");
		//not able to add ----java.lang.UnsupportedOperationException
		
		
		
		
		ArrayList<String> list1= new ArrayList<String>();
		list1.add("A");
		ArrayList<String> list2= new ArrayList<String>();
		list2.add("B");
		ArrayList<String> list3= new ArrayList<String>();
		list3.addAll(list1);
		list3.addAll(list2);
		for (String s : list3) {
			System.out.println("s :"  + s);
		}
		
		//jodi kono arraylist ke iterate o korchi,, same time e oi arraylist theke element remove korchi...
		//then for loop/for each loop use kora jbe na..--concurrent modification error dbe
		//always use Iterator while doing any concurrent modification in a arraylist
		ArrayList<String> magazineList = new ArrayList<String>();
//		for(Iterator<String> itr = magazineList.iterator();itr.hasNext();) {
//			if(itr.next().toString().equalsIgnoreCase("A")) {
//				itr.remove();
//			}
//		}
		
		Iterator<String> itr = magazineList.iterator();
		while(itr.hasNext()) {
			if(itr.next().toString().equalsIgnoreCase("A")) {
				itr.remove();
			}
		}
		
	}
	
	public static void main(String[] args) {
		Collection_ArrayList cc= new Collection_ArrayList();
		cc.addElement();
	}
	
	
	
	//4 types of list implementing List Interface
	
	List<String> myArrayList = new ArrayList<String>();
	List<String> myLinkedList = new LinkedList<String>();
	List<String> myVector = new Vector<String>();
	List<String> myStacks = new Stack<String>();
	
	//synchronized list
	List<String> synchronizedArrayList = new CopyOnWriteArrayList<String>();
	//use CopyOnWriteArrayList in java in place of vector if synchronization is required.
	//Vector are now obsolute.
	
	
	//readonly arraylist
	List<String> readOnlyArrayList = Collections.unmodifiableList(myArrayList);
	
	

}
