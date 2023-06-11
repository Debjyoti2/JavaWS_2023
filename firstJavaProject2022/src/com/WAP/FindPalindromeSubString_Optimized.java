package com.WAP;

import java.util.HashSet;

public class FindPalindromeSubString_Optimized {

	public static void main(String[] args) {


		String str = "abcdcab";
		HashSet<String> hashSet = new HashSet<>();
		for(int i=0;i<str.length();i++) {
			isPalindrome(str,i,i,hashSet); //for single char odd char
			isPalindrome(str,i,i+1,hashSet); //for single char even char
		}
		
		System.out.println(hashSet);
		
	}
	
	public static void isPalindrome(String str, int left, int right, HashSet<String> hashSet ) {
		while( (left>=0 && right<str.length())  && (str.charAt(left) == str.charAt(right))  ) {
			hashSet.add(str.substring(left,right+1));
			left--;
			right++;
		}
	}

}
