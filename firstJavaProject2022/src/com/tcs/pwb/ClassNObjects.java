package com.tcs.pwb;

public class ClassNObjects {
	
	
	private String name,cords,distance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getCords() {
		return cords;
	}
	public void setCords(String cords) {
		this.cords=cords;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance=distance;
	}
	

	private void revolve(String name) {
		System.out.println(name + "rotating");
	}
	
	private void distance(String name) {
		System.out.println(name + "distance is XX");
	}
	
	
	
	public static void main(String args[]) {
		
		ClassNObjects cl1= new ClassNObjects();
		cl1.setName("Earth");
		cl1.setCords("X23");
		cl1.setDistance("1123");
		
		cl1.revolve(cl1.getName());
		cl1.distance(cl1.getName());
	}

}
