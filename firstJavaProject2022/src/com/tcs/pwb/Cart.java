package com.tcs.pwb;

import java.util.ArrayList;

public class Cart {
	
	private String cartName;
	private int cartId;
	private double  discount;
	private ArrayList<Product> product = new ArrayList<>();
	
	
	public String getCartName() {
		return cartName;
	}
	public void setCartName(String cartName) {
		this.cartName = cartName;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public ArrayList<Product> getProduct() {
		return product;
	}
	public void setProduct(ArrayList<Product> product) {
		this.product = product;
	}
	
	
	
	

}
