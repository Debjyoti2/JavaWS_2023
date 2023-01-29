package com.pwb.collectionscom.pwb.set;

import java.util.Objects;

public class EmployeePojoForSet {
	
	private int id;
	private String name;
	
	
	EmployeePojoForSet(int id,String name){
		this.id=id;
		this.name=name;
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

	@Override
	public String toString() {
		return "EmployeePojoForSet [id=" + id + ", name=" + name + "]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeePojoForSet other = (EmployeePojoForSet) obj;
		return id == other.id;
	}
	

}
