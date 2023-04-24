package com.pwb.transient_keyword;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private static final Long serialVersionUID=-4724957588046435474L;
	
	private int id;
	private String name;
	private String address;
	private transient String password;
	
	public Employee(int id, String name, String address, String password) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	
	

}
