package com.tcs.interfaces;

public interface Wifi {
	
	public String[] getNetworkList();
	public void connectToNetwork();
	
	//default method implement korte hy na.... implements subclass gulo te..backward compatibility r jonno kora java 8 theke
	public  default void getWifiName() {
		String name =getName();
		System.out.println("wifiname ::" + name);
	}

	
	//private method only interface r vitore ei available thake.. child class e available hoy na
	//jokhon default method r functional logic onek boro hoye jay, tokhn logic ke private method e distribute kore deoya hy
	private String getName() {
		return "CityCable";
	}
}
