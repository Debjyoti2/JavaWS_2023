package com.java8.lambda_add_2_nums;

public class Main_Method {

	public static void main(String[] args) {

		Functional_Interface_add_2_num fi =  (x,y)-> x+y;
		System.out.println(fi.add_2_num(2,20));

	}

}
