package com.sujata.training;

import com.sujata.demo.Grade;
import com.sujata.demo.Marks;
import com.sujata.demo.Student;

public class MyMain {

	public static void main(String[] args) {
		Student st=new Student();
		st.inputStudentDetails(101, "AAAAA");
		st.displayStudent();

		System.out.println("========================");
		Marks mOb=new Marks();
		mOb.inputStudentWithMarks(111, "XYZ", 78, 89, 95);
//		mOb.inputStudentDetails(111, "XYZ");
//		mOb.inputMarks(12, 89, 90);
		mOb.displayStudentWithMarks();

		System.out.println("==========================");
		Grade gOb=new Grade();
		gOb.inputStudentWithMarks(102, "MNO", 56, 89, 78);
		gOb.calculateGrade();
		gOb.displayStudentWithMarks();
		System.out.println("Grade : "+gOb.getGrade());
	}

}
