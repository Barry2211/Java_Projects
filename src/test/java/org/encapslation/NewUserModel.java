package org.encapslation;

public class NewUserModel {
	private String firstName;
	private String surName;
	private long phone;
	private String password;
	
	public String getFirstName() {
		return firstName;
	}
	public String getSurName() {
		return surName;
	}
	public long getPhone() {
		return phone;
	}
	public String getPassword() {
		return password;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
