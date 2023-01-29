package com.tcs.pwb;

import java.math.BigDecimal;

public class RectangleRunner {

	public static void main(String[] args) {

		Rectangle rt = new Rectangle(new BigDecimal(10.5),new BigDecimal(5.6));
		
		BigDecimal area = rt.calculateArea();
		System.out.println("Area is  : " + area);
		
		rt.increaseLength(new BigDecimal(11.5));
		rt.increaseWidth(new BigDecimal(6.6));
		
		area = rt.calculateArea();
		System.out.println("Area is  : " + area);
		
		
		

	}

}
