package com.pwb.shallow_Copy_Deep_Copy.deepcopy;

public class Address implements Cloneable{
	
	private String addressName;

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	
   @Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}	
	
	

}
