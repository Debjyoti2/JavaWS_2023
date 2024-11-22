package com.WAP.one_class_implements_2_intrerface_have_sm_default_method;

public class ChildClass implements Interface_11,Interface_22 {
	
	public static void main(String[] args) {
		ChildClass c= new ChildClass();
		c.method_1();
	}

	@Override
	public void method_1() {
		Interface_11.super.method_1();
	}


}
