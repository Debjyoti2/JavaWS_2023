package com.WAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Parenthesis_Checker {
	
	/**
	 * 
	 * Check if Brackets are Balanced in a given String.
	 *  
	 *  (){}[]- Balanced
	 *  ({]])( - Not Balanced
	 *  {[()]} - Balanced
	 *  {[)(])} - Not Balanced
	 *  {[}] - Not Balanced
	 *  
	 **/
	
	public static void main(String[] args) {
		boolean retFlag  = isBalanced("{[}]");
		System.out.println("isBalanced ::   " + retFlag);
	}
	
	
	
	public static boolean isBalanced(String str) {
		
		Map<Character,Character> bracketMap = new HashMap<>();
		bracketMap.put('(',')');
		bracketMap.put('{','}');
		bracketMap.put('[',']');
		
		Stack<Character> charstack = new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(bracketMap.containsKey(c)) {
				charstack.add(c);
			}
			else{
			  if(charstack.size()>0) {
				 Character e = charstack.peek();
				 Character value = bracketMap.get(e);
				 if(value.equals(str.charAt(i))) {
					 charstack.pop();
				 }
				 else {
					 return false;
				 }
				 
			  }
			  else {
				  return false;
			  }
			}
			
			if(charstack.size()==0) {
				return true;
			}
			
		}
		
		return false;
	}

}
