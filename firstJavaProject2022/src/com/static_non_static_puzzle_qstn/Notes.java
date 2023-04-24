package com.static_non_static_puzzle_qstn;

public class Notes {
	
	private int a;
	
	
	private static int b;
	
	
	
	   /*
	   a non static variable cant be placed inside a static method.  static method allows only static variables.
       */
      public  static void print(){
    	  //a++;    error
    	  //System.out.println(a);
      }
      
	 
	 
	 
      /*
	   a static variable can be placed inside a non static method. 
      */
	 public void print2() {
		 b++;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	

}
