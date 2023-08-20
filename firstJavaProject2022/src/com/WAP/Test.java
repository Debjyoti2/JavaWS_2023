package com.WAP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

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
		
		
		
		//Find duplicates in an array
		
		int arr[] = {1,2,3,4,2,3};
		List<Integer> intList = new ArrayList<>();
	       for(int i=0;i<arr.length;i++){
	           intList.add(arr[i]);
	       }
	       Map<Integer,Long> intmap = intList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	    
	      for(Map.Entry<Integer,Long> mp : intmap.entrySet()){
	          if(mp.getValue()>1){
	              System.out.print(" " + mp.getKey());
	          }
	      }
	      
	      
	      //2nd soln
	      Set<Integer> distinctSet = new HashSet<>();
	      Set<Integer> duplicateSet = new HashSet<>();
	      for(int i=0;i<arr.length;i++) {
	    	  if(!distinctSet.contains(arr[i])) {
	    		  distinctSet.add(arr[i]);
	    	  }
	    	  else {
	    		  duplicateSet.add(arr[i]);
	    	  }
	      }

	      List<Integer> list = new ArrayList<>();
	      list.addAll(duplicateSet);
	      
	      System.out.println("");
	      
	      Integer arr2[] = {1,2,3,4,2,3};
	      List<Integer> intList2 = List.of(arr2);
	      Set<Integer> duplicates = new HashSet<>();
	      intList2.stream().filter(e->!duplicates.add(e)).collect(Collectors.toList());
	      System.out.println("Duplicates :: " + duplicates);
		
	}
}
