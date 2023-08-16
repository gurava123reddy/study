package com.study.model;

public class StuAddress {
	
	private String houseNo;
	private String location;
	private String city;
	private int whatsAppNo;
	private String fatherName;
	private int fatherPhoneNo;
	private int motherPhoneNo;
	public void setFatherPhoneNo(int fatherPhoneNo) {
		this.fatherPhoneNo = fatherPhoneNo;
	}
	public void setMotherPhoneNo(int motherPhoneNo) {
		this.motherPhoneNo = motherPhoneNo;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getWhatsAppNo() {
		return whatsAppNo;
	}
	public void setWhatsAppNo(int whatsAppNo) {
		this.whatsAppNo = whatsAppNo;
	}
	public int getFatherPhoneNo() {
		return fatherPhoneNo;
	}
	public int getMotherPhoneNo() {
		return motherPhoneNo;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	@Override
	public String toString() {
		return "StuAddress [houseNo=" + houseNo + ", location=" + location + ", city=" + city + ", whatsAppNo="
				+ whatsAppNo + ", fatherName=" + fatherName + ", fatherPhoneNo=" + fatherPhoneNo + ", motherPhoneNo="
				+ motherPhoneNo + "]";
	}
	
	
	

}
