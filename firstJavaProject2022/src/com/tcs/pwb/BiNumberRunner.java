package com.tcs.pwb;

import java.math.BigDecimal;

public class BiNumberRunner {
	
	public static void main(String args[]) {
		
		BiNumbers num = new BiNumbers(2,3);
		
		System.out.println("Add :" + num.addNumber());
		System.out.println("Multiply : " + num.multiply());
		
		num.doubleNumber();
		
		System.out.println(num.getNumber1());
		System.out.println(num.getNumber2());
		
		Double dbl= 34.12345678923244345;
		
		//always use bigdecimal for any accurate calculation
		//float and double have approximation error always
		BigDecimal a= new BigDecimal("1.40");
		BigDecimal b= new BigDecimal("2.40");
		
		BigDecimal c;
		c=a.add(b);
		int i=5;
		c.add(new BigDecimal(i));
		System.out.println(c);

	}

}
