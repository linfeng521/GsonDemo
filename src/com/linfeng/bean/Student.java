package com.linfeng.bean;

import com.google.gson.annotations.SerializedName;

public class Student {
	@SerializedName("U_ID")
	private int id;
	@SerializedName("User_name")
	private String name;
	@SerializedName("AGE")
	private int age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
