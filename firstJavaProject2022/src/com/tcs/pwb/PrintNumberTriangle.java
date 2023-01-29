package com.tcs.pwb;

public class PrintNumberTriangle {

	public static void main(String[] args) {

		//printNumber(5);
		//printNumber2(5);
		
		int count=0;
		while(count<5) {
			System.out.println("***" + count);
			count++;
		}
		
		int count1=5;
		do {
			System.out.println("***" + count1);
			count1++;
			System.out.println("inside do while. execute atleast once");
		}
		while(count1<10);


	}
	
	public static void  printNumber(int number) {
		String printStr="";
		for(int i=1;i<=number;i++) {
			printStr=printStr+" "+"*";
			System.out.println(printStr);
		}
	}
	
	public static void  printNumber2(int number) {
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.println(j+" ");
			}
			
		}
	}
	
	

}
