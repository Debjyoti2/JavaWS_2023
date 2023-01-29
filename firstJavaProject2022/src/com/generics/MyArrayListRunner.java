package com.generics;

public class MyArrayListRunner {

	public static void main(String[] args) {

		MyArrayList<String> newlist = new MyArrayList<>();
		newlist.addElement("ABC");
		
		MyArrayList<Integer> newlist2 = new MyArrayList<>();
		newlist2.addElement(12313);
	}

}
