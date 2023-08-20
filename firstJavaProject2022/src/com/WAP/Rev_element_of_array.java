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
		
		
		String str="abc";
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			sb.append(str.charAt(str.length()-1-i)) ;
		}
		
		System.out.println(sb.toString());
	}

}
