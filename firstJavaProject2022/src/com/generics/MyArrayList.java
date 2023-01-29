package com.generics;

import java.util.ArrayList;

public class MyArrayList<T> {
	
	ArrayList<T> list = new ArrayList<T>();
		
	public void addElement(T element) {
		list.add(element);
	}

}
