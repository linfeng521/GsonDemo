package com.linfeng.bean;

import com.google.gson.annotations.Until;

public class StudentAnnotion {
	private String fristName;
	private String laseName;
	/*@Since(1.0)private String emailAddress;
	@Since(1.1)private String address;
	@Since(1.2)private String password;*/
	@Until(1.0)private String emailAddress;
	@Until(1.1)private String address;
	private String password;
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLaseName() {
		return laseName;
	}
	public void setLaseName(String laseName) {
		this.laseName = laseName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public StudentAnnotion() {
		super();
	}
	public StudentAnnotion(String fristName, String laseName, String emailAddress, String address, String password) {
		super();
		this.fristName = fristName;
		this.laseName = laseName;
		this.emailAddress = emailAddress;
		this.address = address;
		this.password = password;
	}
	
	
	

}
