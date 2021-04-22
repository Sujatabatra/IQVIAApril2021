package com.sujata.demo;

//reusing Student , i.e whatever we have already done in student need not to do
public class Marks extends Student {

	// extending the functionality , i.e adding new functionality to parents
	// class specified in extends
	private int marks1, marks2, marks3;

	public void inputStudentWithMarks(int rollNo, String name, int marks1, int marks2, int marks3) {
		inputStudentDetails(rollNo, name);
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	public void displayStudentWithMarks() {
		displayStudent();
		System.out.println("Marks1 : " + marks1);
		System.out.println("Marks 2 : " + marks2);
		System.out.println("Marks 3 : " + marks3);
	}

	public int getMarks1() {
		return marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public int getMarks3() {
		return marks3;
	}

}
