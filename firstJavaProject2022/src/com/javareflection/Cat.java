package com.javareflection;

public class Cat {

	private String catName;
	private int catAge;
	public int getCatAge() {
		return catAge;
	}
	public void setCatAge(int catAge) {
		this.catAge = catAge;
	}
	public String getCatName() {
		return catName;
	}
	
	
	private void sayMewo() {
		System.out.println("Say Mewo");
	}
	
	private void sayHi() {
		System.out.println("Say Hi");
	}
	
	private void methodtoInvoke(String a , String b) {
		System.out.println("Say Hi" + a+b);
	}
	
	
}
