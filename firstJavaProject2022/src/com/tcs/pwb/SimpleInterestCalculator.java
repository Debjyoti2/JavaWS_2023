package com.tcs.pwb;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	
	public BigDecimal calculateSi(BigDecimal principle, BigDecimal interestRate, BigDecimal noOfYears) {
		BigDecimal si;
		si=principle.add((principle.multiply(interestRate).multiply(noOfYears)));
		return si;
	}
	
	
	public static void main(String args[]) {
		SimpleInterestCalculator cc = new SimpleInterestCalculator();
		
		BigDecimal amount;
		BigDecimal principle = new BigDecimal("1000");
		BigDecimal interestRate = new BigDecimal("8.5");
		BigDecimal noOfYears = new BigDecimal("10");
		amount = cc.calculateSi(principle,interestRate,noOfYears);
		System.out.println("Amount is :   " + amount);
		
		
		
		
		//if else
		int i=25;
		if(i==25) {
			System.out.println("I=25");
		}
		if(i==24) {
			System.out.println("I=24");
		}
		else {
			System.out.println("I!=24  && i!=25");
		}
		
		//nested if else
		int i1=25;
		if(i1==25) {
			System.out.println("I1=25");
		}
		else if(i1==24) {
			System.out.println("I1=24");
		}
		else {
			System.out.println("I1!=24  && i1!=25");
		}
		
		
		
		
	}

}
