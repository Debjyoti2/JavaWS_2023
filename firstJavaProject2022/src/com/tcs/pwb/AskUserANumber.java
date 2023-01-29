package com.tcs.pwb;

public class AskUserANumber {

	public static void main(String[] args) {

//		int input=0;
//		do {
//			System.out.println("Hi Enter a Number : ");
//			Scanner scanner = new Scanner(System.in);
//			input= scanner.nextInt();
//			System.out.println("Sqr Of the number is : " + input*input);
//		}while(input>=0);
		
		
		//continue in for loop
		
		for(int i=0;i<10;i++) {
			if(i==5) {
				continue;//skip next lines in this iteration only
			}
			System.out.println("I value : " + i);
		}
		
		

	}

}
