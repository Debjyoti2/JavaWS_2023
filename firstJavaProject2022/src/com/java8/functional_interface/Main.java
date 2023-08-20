package com.java8.functional_interface;

public class Main {

	public static void main(String[] args) {

		CalculateFI<Integer,Integer,Integer> sum = (p,q)->p+q;
		int sumn = sum.calculate(10, 30);
		System.out.println("sumn :: " + sumn);
		
		CalculateFI<Integer,Integer,Integer> minus = (p,q)->p-q;
		int minusn = minus.calculate(50, 30);
		System.out.println("minusn :: " + minusn);

	}

}
