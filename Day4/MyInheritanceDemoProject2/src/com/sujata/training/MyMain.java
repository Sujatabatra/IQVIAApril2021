package com.sujata.training;

import com.sujata.demo.Grade;
import com.sujata.demo.Marks;
import com.sujata.demo.Student;

public class MyMain {

	public static void main(String[] args) {
		Student st=new Student();
		st.inputDetails(101, "AAAAA");
		st.displayDetails();

		System.out.println("========================");
		Marks mOb=new Marks();
		mOb.inputDetails(111, "XYZ", 78, 89, 95);
//		mOb.inputStudentDetails(111, "XYZ");
//		mOb.inputMarks(12, 89, 90);
		mOb.displayDetails();

		System.out.println("==========================");
		Grade gOb=new Grade();
		gOb.inputDetails(102, "MNO", 56, 89, 78);
		gOb.calculateGrade();
		gOb.displayDetails();
		System.out.println("Grade : "+gOb.getGrade());
	}

}
