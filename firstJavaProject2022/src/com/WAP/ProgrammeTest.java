package com.WAP;

import java.util.ArrayList;
import java.util.List;

public class ProgrammeTest {

	public static void main(String[] args) {
		Integer num1=100;
		Integer num2=100;
		Integer num3=500; //integer range is -127 to 128 if more than 128 it creats new referance
		Integer num4=500;
		
		
		if(num3==num4) {  
			System.out.println("num3 same");
		}
		else{
			System.out.println("num3 diff");
		}
		
		
		int[] str = {3,30,34,5,9}; //9543330
		List<Integer> intlist = new ArrayList<>();
		for(int i: str) {
			if(i>9) {
				
			}else {
				intlist.add(i);
			}
		}
		

	}

}
