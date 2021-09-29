package com.nmdb.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
//@Table(name="patient")
//@SecondaryTable(name="records")
public class hospital {

	
	@Id
   
	private int password;
	
	private String name;
	private String type;
	private String state;
	private String owner;
	
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "hospital [" + name + "]";
	}
	
	
	

}
