package practice.com;

import java.util.Arrays;

public class Test1 {
	
	
	public static void main(String[] args) {
		
		int[] intarray = {9,7,5,1,2,3,4,3,7};
		for(int i=0;i<intarray.length;i++) {
			for(int j=i+1;j<intarray.length;j++) {
				if(intarray[i]>intarray[j]) {
					int temp = intarray[i];
					intarray[i]=intarray[j];
					intarray[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(intarray));
		System.out.println("5th largest :: " + intarray[intarray.length-5]);
		
	}

}
