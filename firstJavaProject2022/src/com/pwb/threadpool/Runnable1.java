package com.pwb.threadpool;

public class Runnable1 implements Runnable{

	String name;
	
	Runnable1(String name){
		this.name=name;
	}
	
	@Override
	public void run() {
		//Threadlocal variable
		
		ThreadLocal<String> threadstr = new ThreadLocal<>();
		threadstr.set("Kittu");
		
			System.out.println("Hi New year 2023 :: Thread Name ::: " + name);
	}
	
	
}
