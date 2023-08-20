package com.designpattern.singletone_DP;

public class SingletonClass {
	
	private volatile static SingletonClass singletonClass=null;
	
	private SingletonClass(){
	}
	
	public static SingletonClass getInstances() {
		if(singletonClass==null) {
			synchronized (SingletonClass.class) {
				if(singletonClass==null) {
					singletonClass =  new SingletonClass();
				}
				
			}
			
		}
		return singletonClass;
	}
}
