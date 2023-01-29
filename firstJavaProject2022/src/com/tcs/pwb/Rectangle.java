package com.tcs.pwb;

import java.math.BigDecimal;

public class Rectangle {

	private BigDecimal length;
	private BigDecimal width;
	
	private BigDecimal area;
	
	
	Rectangle(BigDecimal length, BigDecimal width){
		this.length=length;
		this.width=width;
	}
	
	public BigDecimal calculateArea() {
		return this.length.multiply(this.width);
	}
	
	public void increaseLength(BigDecimal length) {
		this.length=length;
	}
	public void increaseWidth(BigDecimal width) {
		this.width=width;
	}
	
	
	
	
}
