package com.generics.practice2;

public class Class_Level_Generics<T> {
	
	T obj;
	
//	Class_Level_Generics(T obj){
//		this.obj=obj;
//	}
	
	public void setObj(T obj) {
		this.obj=obj;
	}
	public T getObj() {
		return this.obj;
	}
	

}
