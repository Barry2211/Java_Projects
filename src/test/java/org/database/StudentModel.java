package org.database;

public class StudentModel {
	private int id;
	private String name;
	private String marks;
	public StudentModel(int id,String brand,String model) {
		this.id=id;
		this.name=brand;
		this.marks=model;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMark() {
		return marks;
	}
}
