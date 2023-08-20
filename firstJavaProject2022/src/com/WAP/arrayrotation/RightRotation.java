package com.WAP.arrayrotation;

import java.util.Arrays;

public class RightRotation {
	
	public static void main(String[] args) {
		
		int[] intarray = {1,2,3,4,5};
		int k=2;
		
		for(int i=0;i<k;i++) {
			int lastelement = intarray[intarray.length-1];
			for(int j=intarray.length-1;j>=1;j--) {
				intarray[j]= intarray[j-1];
			}
			intarray[0] = lastelement;
		}
		
		System.out.println(Arrays.toString(intarray));
		
	}

}
