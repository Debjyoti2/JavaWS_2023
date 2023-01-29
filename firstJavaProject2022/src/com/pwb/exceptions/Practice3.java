package com.pwb.exceptions;

public class Practice3 {
	
	
	public static void main(String[] args) throws MyCustomException {
		
		int[] numbers = new int[10];
		for(int i=1;i<9;i++) {
			numbers[i]=i;
		}
		System.out.println("numbers ::" + numbers);
		
		boolean flag =true;
		int count=0;
		while(flag) {
			System.out.println("Arrays element are ::" + numbers[count]);
			count++;
			if(count>5) {
				flag =false;
				throw new MyCustomException();
				
			}
		}
		
	}

}
