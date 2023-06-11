package com.java8;

import java.util.Arrays;

public class Linear_and_Binary_Search {

	public static void main(String[] args) {

		//linear search

		//		int k =2;
		//		Integer[] intarray = {1,2,3,4,5,6};
		//		for(int i=0;i<intarray.length;i++) {
		//			if(intarray[i]==k) {
		//				System.out.println("Element Present");
		//			}
		//		}


		int arr[] = { 40, 3, 10, 4, 2 };
		
		//sorting array
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		int x = 10;
		int result = binarySearch(arr, x);
		if (result == -1) {
			System.out.println("Element is not present in array");
		}
		else {
			System.out.println("Element is present at " + "index " + result);
		}

	}

	//binary search

	static int binarySearch(int arr[], int x)
	{
		int l = 0, r = arr.length - 1;
		
		while (l <= r) {
			int m = l + (r - l) / 2;

			// Check if x is present at mid
			if (arr[m] == x)
				return m;

			// If x greater, ignore left half
			if (arr[m] < x)
				l = m + 1;

			// If x is smaller, ignore right half
			else
				r = m - 1;
		}

		// If we reach here, then element was
		// not present
		return -1;
	}


















}
