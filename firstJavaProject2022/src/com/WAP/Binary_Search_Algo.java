package com.WAP;

import java.util.Arrays;

public class Binary_Search_Algo {

	public static void main(String[] args) {

		//find index of 23
		
		Integer[] arr= {72,23,8,2,91,56,38,16};
		int element=23;
		
		//first sort the list from smallest to highest
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("sorted list :: " + Arrays.toString(arr));
		
		int findindex = binarySearch(arr,element);
		System.out.println("Element  :: " + element + " index is :: " + findindex);
		

	}
	
	
	public static int binarySearch(Integer[] arr,int element) {
		
		int left=0;
		int right = arr.length-1;
		
		while(left<=right) {
			
			int middleindex = left+(right-1)/2;
			
			if(element==arr[middleindex]) {
				return middleindex;
			}
			if(element>arr[middleindex]) {
				left=middleindex+1;
			}
			if(element<arr[middleindex]) {
				right=middleindex-1;
			}
		}
		
		return -1;
	}
	
	
	

}
