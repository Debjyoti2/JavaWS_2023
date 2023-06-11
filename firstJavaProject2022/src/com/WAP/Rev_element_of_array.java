package com.WAP;

import java.util.Arrays;

public class Rev_element_of_array {
	
	public static void main(String[] args) {
		
		int[] intarray =  {1,2,3,4,5};
		int[] newarray = new int[5];
		for(int i=intarray.length-1;i>=0;i--) {
			newarray[intarray.length-i-1]=intarray[i]; 
		}
		
		System.out.println(Arrays.toString(newarray));
		
	}

}
