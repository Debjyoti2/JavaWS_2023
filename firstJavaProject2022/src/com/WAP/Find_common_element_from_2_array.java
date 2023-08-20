package com.WAP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Find_common_element_from_2_array {
	
	
	public static void main(String[] args) {
		
		//Find_common_element_from_2_array
		
		int[] array1= {80,10,15,2,35,60};
		int[] array2= {35,80,60,20,75};
		
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				if(array1[i]==array2[j]) {
					System.out.println("Common element : " + array1[i] );
				}
			}
		}
		
		
		
		//input : Hello-Learners-Happy-Learning
	    //output : ---HelloLearnersHappyLearning
		String str = "Hello-Learners-Happy-Learning";
		String[] strarray = str.split("-");
		StringBuilder strb =new StringBuilder();
		
		for(int i=0;i<strarray.length-1;i++) {
			strb.append("-");
		}
		for(String s : strarray) {
			strb.append(s);
		}
		System.out.println(strb.toString());
		
		
		//Fibonacci series
		
		//0 1 1 2 3 5 8 13
		int a=0;
		int b=1;
		int c=0;
		System.out.print(a+" "+b);
		for(int i=1;i<=10;i++) {
			c=a+b;
			System.out.print(" " +c);
			a=b;
			b=c;
		}
		
		System.out.println("");
		
		//String Palindrome
		String str1 = "bob";
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=str1.length();i++) {
			sb.append(str1.charAt(str1.length()-i));
		}
		System.out.println(sb.toString());
		if(str1.equalsIgnoreCase(sb.toString())) {
			System.out.println("Yes Palindrome :: " + str1);
		}else {
			System.out.println("No  Palindrome :: " + str1);
		}
		
		//Armstrong number
		Integer number = 1634; //joto gulo number toto power hbe.. 3 te number tai cube hbe
		int sum=0;
		String numstr = String.valueOf(number);
		for(int i=0;i<numstr.length();i++) {
			int eachnum = Integer.valueOf(String.valueOf(numstr.charAt(i)));
			int value =1;
			for(int j=1;j<=numstr.length();j++) {
				value = value*eachnum;
			}
			sum = sum+ value;
		}
		if(sum==number) {
			System.out.println("Yes  Armstrong number :: " + number);
		}
		else {
			System.out.println("No  Armstrong number :: " + number);
		}
		
		
		//prime number check
		int isPrime = 12;
		//1 diye divide hbe, 12 diye o hbe,, sob number ei tai
		// chk koro 2 theke 11 obdhi kau diye divide hbe ki na
		// 2 - (num-1)
		boolean flag=false;
		for(int i1=2;i1<=isPrime-1;i1++) {
			if(isPrime%i1==0) {
				System.out.println("Not prime " + isPrime);
				flag=true;
				break;
				
			}
		}
		if(!flag) {
			System.out.println("Yes prime " + isPrime);
		}
		
		
		
		//Mobile : 7797555010
		//print last 2 no only other should show as ******10
		String mobileNo = "7797555010";
		String mobileNo2 = mobileNo.substring(0,mobileNo.length()-2).replaceAll(".", "*") + mobileNo.substring(mobileNo.length()-2, mobileNo.length());
		System.out.println("mobileNo2 :: " + mobileNo2);
		
		//generate 4 digit otp
		int otp = (int) (Math.random()*9000)+1000;
		System.out.println("otp :: " + otp);
		
		
		
		    List<Integer> list = new ArrayList<Integer>(8);
		    for(int i=0;i<10;i++){
		        list.add(i);
		    }
		    System.out.println(list);
		    
		    Iterator<Integer> itr = list.iterator();
		    while(itr.hasNext()) {
		    	if(itr.next()%3==0) {
		    		itr.remove();
		    	}
		    }
		
//		    for(Integer s : list) {
//		    	if(s%3==0) {
//		    		list.remove(s);
//		    	}
//		    }
		    
		    System.out.println(list);
		
		
		}
	
	
		

}
