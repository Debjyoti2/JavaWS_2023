package com.WAP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {

	static int length=0;
	static String charsubstr="";
	
	public static void main(String[] args) {

		//lps("abcdcab");
		
		List<Integer> arrList= new ArrayList<>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		arrList.add(5);
		
		int a[] = {2,4,6};
	    int b[] = {3,5,7};
	     
	    int l = a.length+b.length;
		int[] all = new int[l];
		
	    for(int i=0;i<a.length;i++) {
	    	all[i] = a[i];
	    }
	    for(int i=0;i<b.length;i++) {
	    	all[a.length+i] = b[i];
	    }
	    System.out.println(Arrays.toString(all));
		
	    
	}

	public static void  lps(String str) {


		for(int i=0;i<str.length();i++){
			palindrome(i,i,str); //even
			palindrome(i,i+1,str); //odd

		}

	}

	public static void palindrome(int left, int right,String str)     {
		while( (left>=0 && right<str.length())  && str.charAt(left)==str.charAt(right)) {
			if(str.length()>length) {
				length=str.length();
				charsubstr=str.substring(left,right+1);
			}
			left--;
			right++;
		}
		System.out.println(charsubstr);


	}




}
