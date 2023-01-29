package com.generics;

public class GenericClass<T> {
	
	//class that print  any values by  may be its a string , integer, boolean.......
	
	T value;
	public GenericClass(T value) {
		this.value=value;
	}
	
	public void printValue() {
		System.out.println("Value :: " + this.value);
	}

}
