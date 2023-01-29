package com.pwb.thread;

public class ThreadCreation2Runner {

	public static void main(String[] args) {

		for(int i=0;i<7;i++) {
			Thread th2= new Thread(new ThreadCreation2());
			th2.start();
		}
		
		

	}

}
