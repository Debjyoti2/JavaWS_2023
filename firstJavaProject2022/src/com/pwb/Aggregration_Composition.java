package com.pwb;

public class Aggregration_Composition {
	
	
    //Association


 // Aggregration(Weak Association)		//Composition(Strong Association)


//1. Aggregration(Weak Association):

public class Driver{

private Car car;

}

public class Car{
	
private String carName;

public String getCarName() {
	return carName;
}


}


public static void main(String[] args) {
	
  //Driver d  = new Driver();
  //d.car.getCarName();

}

//car and driver both can  exist without each other so its Weak Association ,called Aggregration.





//2.Composition(Strong Association)



public class Car2 {
	
	private Engine engine;
	
}

public class Engine{
	
	private int capacitycc;
	
}

//here engine has a strong reln with car , as engline cant exists without car, so its composition.









}
