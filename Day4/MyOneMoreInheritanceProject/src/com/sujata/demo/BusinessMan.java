package com.sujata.demo;

public class BusinessMan extends Person {

	private String natureOfBusiness;
	private int annualTurnover;
	
	public void inputBusinessMan(int id,String name,String natureOfBusiness,int annualTurnover){
		inputPerson(id, name);
		this.natureOfBusiness=natureOfBusiness;
		this.annualTurnover=annualTurnover;
	}
	
	public void displayBusinessMan(){
		displayPerson();
		System.out.println("Nature of Business : "+natureOfBusiness);
		System.out.println("Annual Turn Over : "+annualTurnover);
	}
}
