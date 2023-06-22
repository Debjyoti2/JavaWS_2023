package com.WAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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
		boolean retFlag  = isBalanced("{[()]}");
		System.out.println("isBalanced ::   " + retFlag);
	}
	
	
	
	public static boolean isBalanced(String str) {
		
		Map<Character,Character> bracketMap = new HashMap<>();
		bracketMap.put('(',')');
		bracketMap.put('{','}');
		bracketMap.put('[',']');
		
		char[] chararray = str.toCharArray();
		List<Character> charList = new ArrayList<>();
		for(int j=0;j<chararray.length;j++) {
			charList.add(chararray[j]);
		}
		
		Stack<Character> bracketstack = new Stack<>();
		
		Iterator<Character> itr =charList.iterator();
		while(itr.hasNext()) {
			for(Map.Entry<Character,Character> mp : bracketMap.entrySet()) {
				if(mp.getKey().equals(itr.toString())) {
					bracketstack.add(itr.toString());
					itr.remove();
				}
			}
		}
		System.out.println(bracketstack);
		System.out.println(charList);
		
		int stacksize= bracketstack.size();
		for(int k=0;k<stacksize;k++) {
			Character key = bracketstack.peek();
			for(int l=0;l<charList.size();l++) {
				Character value = bracketMap.get(key);
				if(charList.get(l).equals(value)) {
					bracketstack.pop();
					charList.remove(l);
				}
			}
		}
		
		if(bracketstack.size()==0 && charList.size()==0) {
			return true;
		}
		return false;
	}

}
