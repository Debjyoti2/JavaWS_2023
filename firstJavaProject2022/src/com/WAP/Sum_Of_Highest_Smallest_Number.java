package com.WAP;

import com.sun.jdi.IntegerValue;

public class Sum_Of_Highest_Smallest_Number {
	
	public static void main(String[] args) {
		
		int[] intarray = {2,1,3,4,6,5};
		int min = intarray[0];
		int max = intarray[0];
		
		for(int i=0;i<intarray.length;i++) {
			if(intarray[i]>max) {
				max = intarray[i];
			}
			if(intarray[i]<min) {
				min = intarray[i];
			}
		}
		
		System.out.println("Max: " + max + "  & Min :: " + min + "  && SUM : " + (max+min) );


		int[] intarray2 = {2,1,3,4,6,5};
		int max2= intarray2[0];
		int min2= intarray2[0];
		for(int i=0;i<intarray2.length-1;i++){
			if(intarray2[i]>max2){
				max2=intarray2[i];
			}
			if(intarray2[i]<min2){
				min2=intarray2[i];
			}
		}
		System.out.println( max2+min2);

	}

}
