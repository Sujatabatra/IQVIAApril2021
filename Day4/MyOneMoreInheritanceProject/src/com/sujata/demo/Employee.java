package com.sujata.demo;

public class Employee extends Person {

	private String designation,department;
	private int salary;
	
	public void inputEmployee(int eId,String eName,String desig,String deptt,int sal){
		inputPerson(eId, eName);
		designation=desig;
		department=deptt;
		salary=sal;
	}
	
	
	public void displayEmployee(){
		displayPerson();
		System.out.println("Designation "+designation);
		System.out.println("Department "+department);
		System.out.println("Salary : "+salary);
	}
}
