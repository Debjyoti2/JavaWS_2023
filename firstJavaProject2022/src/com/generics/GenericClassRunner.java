package com.generics;

public class GenericClassRunner {
	
	public static void main(String[] args) {
		GenericClass<String> g = new GenericClass<String>("ABC");
		g.printValue();
		
		GenericClass<Integer> k = new GenericClass<Integer>(20);
		k.printValue();
	}

}
