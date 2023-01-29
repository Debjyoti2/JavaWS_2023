package com.pwb.practice;

public class Human extends Monkey implements BasicAnimal{
	
	
	@Override
	public void eat() {
		System.out.println("eat");
	}
	@Override
	public void sleep() {
		System.out.println("sleep");
	}
	
	public static void main(String[] args) {
		Human h = new Human();
		h.jump();
		
		
		BasicAnimal b = new Human(); //polymorphism can only get basicanimal interfaces method
		b.sleep();
	}

}
