package com.tcs.interfaces;

public class SmartPhone extends CellPhone  implements Wifi,Calculator{
	
	@Override
	public String[] getNetworkList() {
		String[] networks = {"Kittu4g", "Madhu5g"};
		return networks;
	}
	
	@Override
	public void connectToNetwork() {
		System.out.println("connecting with networks");
	}
	
	@Override
	public void add(int a,int b) {
		System.out.println(a+b); ;
	}
	
	@Override
	public void multiply(int a,int b) {
		System.out.println(a*b); ;
	}

	
	public static void main(String[] args) {
		SmartPhone s = new SmartPhone();
		s.connectToNetwork();
		s.pickUpCall();
		String[] net= s.getNetworkList();
		for(String s1:net) {
			System.out.println(s1);
		}
		
		//compile time polymorphism
		
		//Wifi wifi = new Wifi(); interface er object create kora jay na
		//so alternative is using java polymorphism, and create a instance of wifi but object of smartphone
		//so that you can access all wifi related functionality only, not all smartphone related functionality
		
		Wifi wifi = new SmartPhone();
		wifi.connectToNetwork();
		
		
	}
	
}
