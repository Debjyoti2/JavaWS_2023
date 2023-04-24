package com.WAP;

import java.util.Arrays;

public class Find_2nd_highst_in_a_array {
	
	public static void main(String[] args) {
		
		int[] a = {20,10,50,40,30};
		
		//highest to smallest
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("sorted  :: " + Arrays.toString(a));
		System.out.println("2nd highest : " + a[1]);
	}

}
