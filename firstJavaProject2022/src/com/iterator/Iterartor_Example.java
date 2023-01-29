package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterartor_Example {

	public static void main(String[] args) {

		List<String> newArrayList  = new ArrayList<String>();
		//List<String> newLinkedList = new LinkedList<String>();
		//List<String> newVector = new Vector<String>();

		newArrayList.add("A");
		newArrayList.add("B");
		newArrayList.add("C");
		newArrayList.add("D");

		Iterator<String> itr = newArrayList.iterator();
		while(itr.hasNext()) {
			System.out.println("Elements :: " + itr.next());
		}


	}

}
