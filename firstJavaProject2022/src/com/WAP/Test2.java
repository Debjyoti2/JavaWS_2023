package com.WAP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {

	static int length=0;
	static String charsubstr="";
	
	public static void main(String[] args) {

		//lps("abcdcab");
		
		List<Integer> arrList= new ArrayList<>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		arrList.add(5);
		
		int a[] = {2,4,6};
	    int b[] = {3,5,7};
	     
	    int l = a.length+b.length;
		int[] all = new int[l];
		
	    for(int i=0;i<a.length;i++) {
	    	all[i] = a[i];
	    }
	    for(int i=0;i<b.length;i++) {
	    	all[a.length+i] = b[i];
	    }
	    System.out.println(Arrays.toString(all));


		//left rotation of array
		int[] arr1 = {1,2,3,4,5};
		int k=2;

		for(int i=0;i<k;i++){
			int n = arr1[0];
			for(int j=0;j<arr1.length-1;j++){
			  arr1[j]=arr1[j+1];
			}
			arr1[arr1.length-1]=n;
		}
		System.out.println("arr1 :: " + Arrays.toString(arr1));


		//right rotation
		int[] arr2 ={1,2,3,4,5};
		int p=2;
		for(int a1=0;a1<p;a1++){

			int lastelement = arr2[arr2.length-1];

			for(int a2=0;a2<arr2.length-1;a2++){
				arr2[arr2.length-1-a2]=arr2[arr2.length-1-a2-1];
			}
			arr2[0]=lastelement;
		}
		System.out.println("arr2 :: " + Arrays.toString(arr2));




	    
	}

	public static void  lps(String str) {


		for(int i=0;i<str.length();i++){
			palindrome(i,i,str); //even
			palindrome(i,i+1,str); //odd

		}

	}

	public static void palindrome(int left, int right,String str)     {
		while( (left>=0 && right<str.length())  && str.charAt(left)==str.charAt(right)) {
			if(str.length()>length) {
				length=str.length();
				charsubstr=str.substring(left,right+1);
			}
			left--;
			right++;
		}
		System.out.println(charsubstr);


	}




}
