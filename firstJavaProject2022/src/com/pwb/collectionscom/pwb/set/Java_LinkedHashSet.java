package com.pwb.collectionscom.pwb.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Java_LinkedHashSet {
	
	
	
	public static void main(String[] args) {
		LinkedHashSet<String> linkhashset = new LinkedHashSet<String>();
		linkhashset.add("A");
		linkhashset.add("B");
		linkhashset.add("C");
		linkhashset.add("D");
		
		System.out.println("LinkedHashSet \n");
		for(String s : linkhashset) {
			System.out.println("Elements : " + s);
		}
		
		System.out.println("HashSet \n");
		HashSet<String> hashset = new HashSet<String>();
		hashset.add("A");
		hashset.add("B");
		hashset.add("C");
		hashset.add("D");
		
		for(String s : hashset) {
			System.out.println("Elements : " + s);
		}
		
		
		System.out.println("Question :: ");
		ArrayList<Character> charArr = new ArrayList<Character>();
		charArr.add('A');
		charArr.add('B');
		charArr.add('A');
		charArr.add('B');
		for(Character s : charArr) {
			System.out.println("char present in arrlist:: " + s);
		}
		
		HashSet<Character> hashChar = new HashSet<Character>(charArr);
		for(Character s : hashChar) {
			System.out.println("char present in hashset:: " + s);
		}
		
	}
	
	/// hashset e only unique member add hobe
	//  linkedhashset e unique and insertion order maintain hbe
	//  TreeSet e unique and sort hoye jbe value gulo..
	
	
	
	
	
	

}
