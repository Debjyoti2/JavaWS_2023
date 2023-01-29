package com.tcs.pwb;

public class Static_Block_In_A_Class {
	
	
	int i;
	
	static {
		System.out.println("This is a static block");
	}
	
	Static_Block_In_A_Class(){
		System.out.println("Code inside constructor");
	}
	
	public static void main(String[] args) {
		Static_Block_In_A_Class t = new Static_Block_In_A_Class();
		Static_Block_In_A_Class t1 = new Static_Block_In_A_Class();
		Static_Block_In_A_Class t2 = new Static_Block_In_A_Class();
		
		//printing the ASCII code--write in single code not in double code..
		System.out.println('b' + 'c' + 'd'); //297
	}

}

//difference of static block and constructor

//static block code only execute once when the class loaded in memory

// but constructor call each time new object is created.