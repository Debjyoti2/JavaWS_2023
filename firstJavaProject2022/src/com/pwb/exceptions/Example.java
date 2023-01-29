package com.pwb.exceptions;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		System.out.println("Basic user given number division for set [10,20,30,40]");

		try {
			int[] numbers = new int[4];
			numbers[0]=10;
			numbers[1]=20;
			numbers[2]=30;
			numbers[3]=40;

			System.out.println("Please enter the number by which you want to devide ::: ");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			
			if(input<0) {
				throw new MyException();
			}

			System.out.println("which array index you want to devide ::: ");
			int index = sc.nextInt();

			int result = numbers[index]/input;

			System.out.println("Your result is  ::: " + result);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index bound exception ");
			e.printStackTrace();
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException exception ");
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException exception ");
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}




}
