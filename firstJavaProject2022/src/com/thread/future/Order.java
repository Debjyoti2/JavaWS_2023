package com.thread.future;

public class Order {
	
	private int id;
	private String name;
	private String orderSts;
	
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
	public String getOrderSts() {
		return orderSts;
	}
	public void setOrderSts(String orderSts) {
		this.orderSts = orderSts;
	}
	public Order(int id, String orderSts) {
		super();
		this.id = id;
		this.orderSts = orderSts;
	}
	
	
	
	

}
