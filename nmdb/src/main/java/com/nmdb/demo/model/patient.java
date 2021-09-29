package com.nmdb.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
//@Table(name="patient")
//@SecondaryTable(name="records")
public class patient {

	
	@Id
   
	private int medicalno;
	
	private String firstname;
	private String lastname;
	private String othername;
	private String gender;
	private String dob;
	private String nationality;
	
	
	
	
	
	
	public int getMedicalno() {
		return medicalno;
	}
	public void setMedicalno(int medicalno) {
		this.medicalno = medicalno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getOthername() {
		return othername;
	}
	public void setOthername(String othername) {
		this.othername = othername;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "patient [Medicalno=" + medicalno + ", firstname=" + firstname + ", lastname=" + lastname + ", othername=" + othername
				+ ", gender=" + gender + ", dob=" + dob + ", nationality=" + nationality + "]";
	}

}

