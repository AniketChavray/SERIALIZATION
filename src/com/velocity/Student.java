package com.velocity;

import java.io.Serializable;

public class Student implements Serializable {
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 548344507847429564L;
	int id;
	String name;
	String city;
	
	Student (int id, String name, String city){
		
		this.id = id;
		this.name= name;
		this.city = city;
		
		}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	

}
