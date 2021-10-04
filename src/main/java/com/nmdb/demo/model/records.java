package com.nmdb.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;



@Entity
public class records {
 @Id
	private int medicalno;
	private String hospital;
	private String day;
	private String purpose ;
	private String symptoms;
	private String dignosis;
	private String treatment;
	private String remark;
	
	public int getMedicalno() {
		return medicalno;
	}
	public void setMedicalno(int medicalno) {
		this.medicalno = medicalno;
	}
	
	
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getDignosis() {
		return dignosis;
	}
	public void setDignosis(String dignosis) {
		this.dignosis = dignosis;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "[Medicalno=" + medicalno + ", Hospital=" + hospital + ", Date=" + day + ", Purpose=" + purpose
				+ ", Symptoms=" + symptoms + ", Dignosis=" + dignosis + ", Treatment=" + treatment + ", Remark="
				+ remark + "]";
	}
	
	
}
