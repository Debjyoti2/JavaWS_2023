package com.pwb.thread;

public class Practice1 extends Thread{
	
	@Override
	public void run() {
		while(true){
			System.out.println("Good Morning");
			System.out.println("Welcome");
		}
	}
	

}
