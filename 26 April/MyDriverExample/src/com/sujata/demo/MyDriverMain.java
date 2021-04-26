package com.sujata.demo;

public class MyDriverMain {

	public static void main(String[] args) {
		Driver sonu=new Driver("Sonu");
		Driver ramesh=new Driver("Ramesh");
		Driver suresh=new Driver("Suresh");
		
		Car audi=new Audi("Red", "A8");
		Car bmw=new BMW("Silver", "Q5");
		Car toyota=new Toyota("Golden", "Altis");
		
		
		ramesh.setCar(bmw);
		ramesh.drive();

	}

}
