package com.WAP.one_class_implements_2_intrerface_have_sm_normal_method;

//interface e normal abstract method thakle prblm nei,, but default method thkle problem

public class ImplementationClass implements Interface_1,Interface_2 {

	@Override
	public void method_1() {
		System.out.println("M1");
		
	}

	@Override
	public void method_2() {
		System.out.println("M2");
		
	}

}
