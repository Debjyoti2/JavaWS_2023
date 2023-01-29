package com.tcs.pwb;

public class MotorBike {
	
	private String make;
	private String manufactureYear;
	private String fualType;
	private String productionCountry;
	private int price;
	private int maxSpeed;
	private int maxTorque;
	private int maxRpm;
	private int currentGear;
	
	public int getCurrentGear() {
		return currentGear;
	}
	public void setCurrentGear(int currentGear) {
		this.currentGear=currentGear;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getManufactureYear() {
		return manufactureYear;
	}
	public void setManufactureYear(String manufactureYear) {
		this.manufactureYear = manufactureYear;
	}
	public String getFualType() {
		return fualType;
	}
	public void setFualType(String fualType) {
		this.fualType = fualType;
	}
	public String getProductionCountry() {
		return productionCountry;
	}
	public void setProductionCountry(String productionCountry) {
		this.productionCountry = productionCountry;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getMaxTorque() {
		return maxTorque;
	}
	public void setMaxTorque(int maxTorque) {
		this.maxTorque = maxTorque;
	}
	public int getMaxRpm() {
		return maxRpm;
	}
	public void setMaxRpm(int maxRpm) {
		this.maxRpm = maxRpm;
	}
	
	
	
	public void adJustSpeed(int speed) {
		System.out.println("Speed adjusted upto :: " + speed);
	}
	
	public void adjustGear(int gear) {
		System.out.println("Gear adjusted to :: " + gear);
	}
	
	
	public static void main(String args[]) {
		MotorBike royalEnfiled = new MotorBike();
		royalEnfiled.setMake("RE");
		royalEnfiled.setMaxSpeed(100);
		royalEnfiled.setCurrentGear(5);
		
		royalEnfiled.adjustGear(royalEnfiled.getCurrentGear());
		royalEnfiled.adJustSpeed(royalEnfiled.getMaxSpeed());
		
	}

}
