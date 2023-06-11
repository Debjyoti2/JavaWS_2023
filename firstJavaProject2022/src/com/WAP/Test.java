package com.WAP;

import java.util.ArrayList;
import java.util.List;

public class Test {

	static int palindromecount=0;
	
	public static  int countSubstrings(String s) {
		//google
		
		for(int i=0;i<s.length();i++){
			loadPalindrome(s,i,i);
			loadPalindrome(s,i,i+1); 
		}
		return palindromecount;
	}

	public static void loadPalindrome(String str, int left, int right){

		while( (left>=0 && right<str.length())  && (str.charAt(left) == str.charAt(right)) ){
			palindromecount++;
			left--;
			right++;
		}

	}


	public static void main(String[] args) {
        
		int count  =countSubstrings("abc");
		System.out.println(count);
		
		
		
		List<String> indexList = new ArrayList<>();
		
		//int sum=9;
		//int sum=5;
		int sum=10;
		Integer[] intarray = {1,3,2,7,9};
		for(int i=1;i<intarray.length;i++) {
			for(int j=i+1;j<intarray.length;j++) {
				if(intarray[i]+intarray[j]==sum) {
					indexList.add("index are :: " + i + " and " + j );
				}
			}
		}
		System.out.println(indexList);
		
	}
}
