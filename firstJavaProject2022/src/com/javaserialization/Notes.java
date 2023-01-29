package com.javaserialization;

import java.io.Serializable;

public class Notes {
	
	
	//java serialization use kore kono java object ke byte code e convert kora hoy.
	// let say erokom requirement je amr application e roj ke ke login kore seta niye ekta separate team analysis korbe
	//seta ami ekta backend e table e store kore dite pari..
	//but ami eta na kore , obj gulo ke serialize kore byte code e file e print koriye server e save kore rakhi...then 
	//pore sei file gulo dhore oi team ke diye dbo tara , sei file gulo deserialize kore emp details peye jabe.
	
	
	
	class Employee implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private int id;
		private String name;
		
	}

}
