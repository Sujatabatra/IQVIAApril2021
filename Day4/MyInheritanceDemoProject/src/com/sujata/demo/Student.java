package com.sujata.demo;

public class Student {
	
	private int rollNo;
	private String name;
	
	
	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public void inputStudentDetails(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public void displayStudent(){
		System.out.println("Roll No : "+rollNo);
		System.out.println("Name : "+name);
	}

}
