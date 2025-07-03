package org.encapslation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EncapslationProgram {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		List <UserDataModel> data = new ArrayList<>();
		data =  Arrays.asList(
			    new UserDataModel("Alice", "qwerty"),
			    new UserDataModel("Bob", "abcde"),
			    new UserDataModel("Charlie", "")
			);
		for(UserDataModel model:data) {
			System.out.println("UserName: "+model.email+ "  Password: "+model.password);
		}
	}
}
