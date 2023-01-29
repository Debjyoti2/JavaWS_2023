package com.pwb.polymorphism;


//best example
//runtime polymorphism is also called dynamic method dispatch

interface Parent{
	void print();
}

class Child1 implements Parent{

	@Override
	public void print() {
		System.out.println("Child 1 print");

	}

}



class Child2 implements Parent{

	@Override
	public void print() {
		System.out.println("Child 2 print");

	}

}

class Child3 implements Parent{

	@Override
	public void print() {
		System.out.println("Child 3 print");

	}

}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		Parent p1 = new Child1();
		p1.print();//child1 object called
		
		
		//now if i do a small change new Child2(); then child2 object is getting called.
		//so in runtime its deciding which class object it should called
		
		Parent p2 = new Child2();
		p2.print();




	}	


}
