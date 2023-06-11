package com.WAP;

import java.util.ArrayList;
import java.util.List;

public class FindPalindromeSubString {
	
	public static void main(String[] args) {
		
		//String str = "abaab";
		String str = "abbaeae";
		String[] strarray = str.split("");
		List<String> allsubstrList = new ArrayList<>();
		List<String> palindromesubstrList = new ArrayList<>();
		
		
		//to find all substring
		
		for(int i=0;i<strarray.length;i++) {
			for(int j=i;j<strarray.length;j++) {
				String eachsubstr = str.substring(i,j+1);
				allsubstrList.add(eachsubstr);
				if(isPalindrome(eachsubstr)) {
					palindromesubstrList.add(eachsubstr);
				}
			}
		}
		System.out.println("allsubstrList ::  " + allsubstrList);
		System.out.println("palindromesubstrList ::  " + palindromesubstrList);
		
		
		
		
	}
	
	// just reversing the string and chking if both same then palindrome
	public static boolean isPalindrome(String str) {
		if(str.length()>1) {
			return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
		}
		else {
			return false;
		}
		
	}
	

}
