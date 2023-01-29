package com.generics.practice3;

public class Generics_3_Runner<T extends A> {
	
	T t;
	
	Generics_3_Runner(T t){
		this.t=t;
	}
	
	public void print() {
		this.t.printMethod();
	}
	
	
    public static void main(String[] args) {
		
    	Generics_3_Runner<A> class1 = new Generics_3_Runner<A>(new A());
		class1.print();
		
		Generics_3_Runner<B> class2 = new Generics_3_Runner<B>(new B());
		class2.print();
		
	}

}

