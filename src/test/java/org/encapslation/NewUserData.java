package org.encapslation;

public class NewUserData extends NewUser{
	
	public static void main(String[] args) {
		NewUser data =new NewUser();
		String firstName = data.user.getFirstName();
		String surName = data.user.getSurName();
		long phone = data.user.getPhone();
		String password = data.user.getPassword();
		System.out.println(firstName);
		System.out.println(surName);
		System.out.println(phone);
		System.out.println(password);
	}
}
