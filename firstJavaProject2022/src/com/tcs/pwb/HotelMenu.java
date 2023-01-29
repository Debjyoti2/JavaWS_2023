package com.tcs.pwb;

import java.util.Scanner;

public class HotelMenu {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int result;

		System.out.println("Enter First Number : ");
		int a = scan.nextInt();

		System.out.println("Enter Second Number :  ");
		int b=scan.nextInt();

		System.out.println("Choose a Operation:  \n 1.Add : \n 2.multiply: \n 3.divide: \n 4.Substract : \n");

		int operation=scan.nextInt();

		/*if(operation==1){
			result = a+b;
		}
		else if(operation==2){
			result=a*b;
		}else if(operation==3){
			result=a/b;
		}else if(operation==4){
			result=a-b;
		} else {
		result=0; 
		}
		System.out.println("Final Result is : " + result); */
		
		switch (operation){
		 case 1: result = a+b; break;
		 case 2: result=a*b; break;
		 case 3: result=a/b; break;
		 case 4: result=a-b; break;
		 default : result=0; break;
		}
		System.out.println("Final Result is : " + result);
		
		 
		 
		
		String str[]=  {"Praveen Kumar",  
						"Yuvraj Singh",  
						"Harbhajan Singh",  
						"Gurjit Singh",  
						"Virat Kohli",  
						"Rohit Sharma",  
						"Sandeep Roy",  
						"Milkha Singh"  };
	
	String reqSurName="Singh";
	int reqSurNameSize=reqSurName.length();
	
	for(String st:str) {
		if(reqSurName.equalsIgnoreCase(st.substring(st.length()-reqSurNameSize,st.length()))) {
			System.out.println("Name with Singh Titles are :  " + st);
		}
	}
		
		
	}

}
