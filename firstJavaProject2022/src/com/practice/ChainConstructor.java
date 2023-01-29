package com.practice;

public class ChainConstructor {
	
	private int a;
	private int b;
	private int c;
	
	public ChainConstructor(int a,int b,int c) {
		this(b,c);
		this.a=a;
	}
	public ChainConstructor(int b,int c) {
		this(c);
		this.b=b;
	}
	public ChainConstructor(int c) {
		this.c=c;
	}
	
	@Override
	public String toString() {
		return "ChainConstructor [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
}
