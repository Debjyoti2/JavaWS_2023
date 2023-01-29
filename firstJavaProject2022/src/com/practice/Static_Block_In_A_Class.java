package com.practice;

public class Static_Block_In_A_Class {
	
	
	int i;
	
	static {
		System.out.println("This is a static block");
	}
	
	Static_Block_In_A_Class(int i){
		this.i=i;
	}
	
	public static void main(String[] args) {
		Static_Block_In_A_Class t = new Static_Block_In_A_Class(5);
		System.out.println(t.i);
	}

}
