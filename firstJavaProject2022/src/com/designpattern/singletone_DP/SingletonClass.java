package com.designpattern.singletone_DP;

public class SingletonClass {
	
	private static SingletonClass singletonClass;
	
	private SingletonClass(){
	}
	
	public static SingletonClass getInstances() {
		if(singletonClass==null) {
			
			synchronized (SingletonClass.class) {
				singletonClass =  new SingletonClass();
			}
			
		}
		return singletonClass;
	}
}
