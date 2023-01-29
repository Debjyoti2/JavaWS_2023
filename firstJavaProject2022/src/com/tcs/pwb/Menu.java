package com.tcs.pwb;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		//for loop when start end is known;i=0 means start is known, i<list.length means end is known;
		//while loop when start and end is unknown;
		//do while when  start and end is unknown and execute the statement atleast once; 

		int operation;
		int result=0;
		do {
			Scanner scanner = new Scanner(System.in);


			System.out.println("Enter Number 1 : ");
			int number1= scanner.nextInt();

			System.out.println("Enter Number 2 : ");
			int number2= scanner.nextInt();

			System.out.println("Choose Operation : 1-Add \n 2-Substract \n 3-Divide \n 4-Multiply \n 5-Exit");
			operation= scanner.nextInt();

			if(operation==1) {
				result=number1+number2;
			}else if(operation==2) {
				result=number1-number2;
			}
			else if(operation==3) {
				result=number1/number2;
			}
			else if(operation==4) {
				result=number1*number2;
			}

			System.out.println("Result is : " + result);

		}
		while(operation<=4);
		
		
		
		
		


	}

}
