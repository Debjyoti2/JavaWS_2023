package com.WAP;

import java.util.ArrayList;
import java.util.List;

public class Left_Rotation {
	
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		List<Integer> retlist2 = rotateLeft(3,intList);
		System.out.println(retlist2);
		
		
		
	}
	
	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
		 List<Integer> retlist= new ArrayList<>();
		  if(d>arr.size()) {
			  d=d%arr.size();
		  }
		  for(int i=0;i<d;i++) {
			 retlist = swapleft(arr);
		  }
		  
		  return retlist;
	 }
	
	public static List<Integer> swapleft(List<Integer> arr) {
		int temp=arr.get(0);
		for(int j=0;j<arr.size()-1;j++) {
			arr.set(j,arr.get(j+1));
		}
		arr.set(arr.size()-1,temp);
		
		return arr;
	}
	
	

}
