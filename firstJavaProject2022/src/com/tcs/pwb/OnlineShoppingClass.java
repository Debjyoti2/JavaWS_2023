package com.tcs.pwb;

import java.util.ArrayList;

public class OnlineShoppingClass {

	private String companyName;
	private String founder;
	
	private ArrayList<Person> person= new ArrayList<>();
	private ArrayList<Cart> carts = new ArrayList<>();
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	public ArrayList<Person> getPerson() {
		return person;
	}
	public void setPerson(ArrayList<Person> person) {
		this.person = person;
	}
	public ArrayList<Cart> getCarts() {
		return carts;
	}
	public void setCarts(ArrayList<Cart> carts) {
		this.carts = carts;
	}
	
	
	
	
}
