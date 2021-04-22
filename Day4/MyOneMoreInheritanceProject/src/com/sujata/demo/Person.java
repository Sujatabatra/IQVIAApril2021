package com.sujata.demo;

public class Person {

	private int personId;
	private String personName;
	
	public void inputPerson(int personId,String personName){
		this.personId=personId;
		this.personName=personName;
	}
	
	public void displayPerson(){
		System.out.println("Person Id : "+personId);
		System.out.println("Person Name : "+personName);
	}
}
