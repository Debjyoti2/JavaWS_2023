package com.inter_thread_communication;

public class Thread_Runner {
	
	public static void main(String[] args) {
		int number=0;
		
		Thread th1 =new Thread(new Thread1(number));
		th1.start();
		
		Thread th2 =new Thread(new Thread2(number));
		th2.start();
		
		Thread th3 =new Thread(new Thread3(number));
		th3.start();
		
		
		
		
	}
	

}
