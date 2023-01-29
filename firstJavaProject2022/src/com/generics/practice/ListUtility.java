package com.generics.practice;

public class ListUtility<T extends Number> {
	
	T obj;
	
	ListUtility(T element){
		this.obj=element;
	}
	
	public T getObj() {
		return this.obj;
	}

}
