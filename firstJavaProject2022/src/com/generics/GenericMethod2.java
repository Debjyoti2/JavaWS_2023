package com.generics;

public class GenericMethod2 {

	public <E> void printElements(E[] elements){
		for(E e : elements) {
			System.out.println("Elements :  " + e);
		}
	}

	public static void main(String[] args) {
		
		GenericMethod2 m  = new GenericMethod2();
		Integer[] intarray = {2,3,4,5,6};
		m.printElements(intarray);
		
		
		String[] strarray = {"A","B","C"};
		m.printElements(strarray);
	}

}
