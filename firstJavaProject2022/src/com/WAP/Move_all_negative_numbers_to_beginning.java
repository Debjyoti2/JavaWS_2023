package com.WAP;

import java.util.Arrays;

public class Move_all_negative_numbers_to_beginning {
	
	//Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
	//Output: -12 -13 -5 -7 -3 -6 11 6 5

   public static void main(String[] args) {
	
	   int[] intarray = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
	   for(int i=0;i<intarray.length;i++) {
		   for(int j=i+1;j<intarray.length;j++) {
			   if(intarray[j]<intarray[i]) {
				   int temp = intarray[i];
				   intarray[i]=intarray[j];
				   intarray[j]=temp;
			   }
		   }
	   }
	   
	   System.out.println(Arrays.toString(intarray));




	   //Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
	   //Output: -12 -13 -5 -7 -3 -6 11 6 5

		for(int i=0;i<intarray.length-1;i++){
			if(intarray[i]>intarray[i+1]){
				int temp = intarray[i];
				intarray[i]=intarray[i+1];
				intarray[i+1] =temp;
			}
		}
	   System.out.println("intarray :: " + Arrays.toString(intarray));


    }

}
