package com.java8.functional_interface;

@FunctionalInterface
public interface CalculateFI<P,Q,R> {
	
	R calculate(P p, Q q);

}
