package com.tcs.pwb.leetcodeproblems;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		 
		FizzBuzz f = new FizzBuzz();
		f.fizzBuzz(5);

	}
	
	public List<String> fizzBuzz(int n) {
        
        ArrayList<String>numbers = new ArrayList<String>();
        String returnstr;
        for(int i=1;i<=n;i++){
           returnstr = this.getStringValue(i);
           numbers.add(returnstr);
        }
        System.out.println("Numbers : " + numbers);
        return numbers;

    }
	
	 public String getStringValue(int number){
	        if(number%15==0){
	            return "FizzBuzz";
	        }
	        else if(number%3==0){
	            return "Fizz";
	        }
	        else if(number%5==0){
	            return "Buzz";
	        }
	        else{
	            return String.valueOf(number);
	        }
	    }
	
	
	 
}
