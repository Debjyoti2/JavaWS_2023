package com.tcs.pwb;

import java.util.ArrayList;

public class CustomerFlipkart {
	
	private String name;
	private int custId;
	private int walletBalance;
	private String email;
	private int mobileNo;
	private ArrayList<CustomerAddress> addressList = new ArrayList<CustomerAddress>();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getWalletBalance() {
		return walletBalance;
	}
	public void setWalletBalance(int walletBalance) {
		this.walletBalance = walletBalance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public ArrayList<CustomerAddress> getAddressList() {
		return addressList;
	}
	public void setAddressList(ArrayList<CustomerAddress> addressList) {
		this.addressList = addressList;
	}
	
	

}
