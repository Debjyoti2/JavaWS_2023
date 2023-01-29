package com.pwb.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Excercise1 {

	public static void main(String[] args) {

		 final String str ="this is a great thing. this should be done again. ";
		 
		 
		 
	     /* find how many distinct char present and put their count in a map */
		 
		 Map<String,Integer> charCountMap = new HashMap<>();
		 
		 String[] strarray = str.split("");
		 for(String c : strarray) {
			 if(!" ".equalsIgnoreCase(c) && c!=null) {
				 if(!charCountMap.containsKey(String.valueOf(c))) {
					 charCountMap.put(c,1); 
				 }
				 else {
					 int existingCount=0;
					  existingCount = charCountMap.get(c);
					  existingCount++;
					  charCountMap.replace(c, existingCount);
					 
				 }
				 
			 }
			
		 }
		 
		 Set<String> keySetList = new HashSet<String>();
		 keySetList = charCountMap.keySet();
		 for(String s : keySetList) {
			 System.out.println("Key is  :: "  + s + " and the present count is :: " + charCountMap.get(s));
		 }
		 
		 
		 
		 /* find how many distinct word present and put their count in a map */
		 
		  Map<String,Integer> wordCountHashMap = new HashMap<String,Integer>();
		  String[] newstrArray = str.split(" ");
		  for(String s1 : newstrArray) {
			  if(!wordCountHashMap.containsKey(s1)) {
				  wordCountHashMap.put(s1, 1);
			  }
			  else {
				  Integer wordCount = wordCountHashMap.get(s1);
				  wordCount++;
				  wordCountHashMap.replace(s1, wordCount);
			  }

		  }
		  
		  //type 1 for map iteration
		  Set<String> mapKeyElements = new HashSet<String>();
		  mapKeyElements=wordCountHashMap.keySet();
		  for(String s2 : mapKeyElements) {
			  System.out.println("Key Elements is " + s2 + " and count is :::"  + wordCountHashMap.get(s2));
		  }
		  
		  //type 2 for map iteration
		  for(Map.Entry<String,Integer> map: wordCountHashMap.entrySet()) {
			  System.out.println(map);
			  System.out.println(map.getKey());
			  System.out.println(map.getValue());
		  }
		  
		  
        
	}

}
