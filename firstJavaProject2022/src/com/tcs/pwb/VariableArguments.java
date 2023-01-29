package com.tcs.pwb;

import java.util.Arrays;

//dynamic arguments passing
//in a method only 1 variable argument can be passed and that too be the last parameter.

public class VariableArguments {
	
		static String car1="TATA";
		static String car2="BMW";
		static String car3="HONDA";
		
		public static void printcar(String... cars) {
			for(String car:cars) {
				System.out.println("Cars are : " + car);
			}
		}
				
		
		static String[] daysArray = new String[] {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		public static void maxLengthDays(String[] daysArray) {
			int maxlength=0;
			String maxlenthDays="";
			for(String s:daysArray) {
				if(s.length()>maxlength) {
					maxlenthDays=s.toString();
					maxlength=s.length();
				}
				
			}
			
			System.out.println("MaxLenthDays is : " + maxlenthDays);
		}
		
		
		public static void printDaysBackWards(String[] daysArray) {
			String[] revdaysArray= new String[7];
			for(int i=daysArray.length-1;i>=0;i--) {
				System.out.println("Individual  Days are : " +daysArray[i] );
				revdaysArray[6-i]=daysArray[i];
			}
			
			System.out.println("Reversed array is : " + Arrays.toString(revdaysArray));
		}
		
		
		
        public static void main(String args[]) {
        	printcar(car1,car2);
        	printcar(car1,car2,car3);
        	maxLengthDays(daysArray);
        	printDaysBackWards(daysArray);
        }
		
		
		

	
	
	

}
