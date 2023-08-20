package com.WAP.arrayrotation;

import java.util.Arrays;

public class LeftRotation {
	
	public static void main(String[] args) {
		
		int[] intarray = {1,2,3,4,5};
		int k=2;
		
		for(int i=0;i<k;i++) {
			int firstelement = intarray[0];
			for(int j=0;j<intarray.length-1;j++) {
				intarray[j]=intarray[j+1];
			}
			intarray[intarray.length-1]=firstelement;
		}
		
		System.out.println(Arrays.toString(intarray));
		
	}

}
