package com.thread.java_7_thread_creation;

public class ThreadRunner {
	
public static int counter=0;
	
  public static void main(String[] args) {
	
	  Thread1 th1 = new Thread1();
	  th1.start();
	  
	  Thread2 th2 = new Thread2();
	  th2.start();
	  
	  
}

}
