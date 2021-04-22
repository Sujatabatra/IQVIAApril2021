package com.sujata.training;

import com.sujata.demo.BusinessMan;
import com.sujata.demo.Employee;
import com.sujata.demo.Person;

public class MyMain {

	public static void main(String[] args) {
		Person p=new Person();
		p.inputPerson(101, "Person 1");
		p.displayPerson();

		System.out.println("===================================");
		Employee emp=new Employee();
		emp.inputEmployee(111, "Employee 1", "Associate", "Sales", 12345);
		emp.displayEmployee();
		
		System.out.println("=================================");
		BusinessMan bm=new BusinessMan();
		bm.inputBusinessMan(102, "Business Man 1", "Hardware", 89076);
		bm.displayBusinessMan();
	}

}
