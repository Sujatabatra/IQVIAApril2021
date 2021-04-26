package com.sujata.demo;

public class Driver {

	private Car car;
	private String name;
	public Driver(String name) {
		super();
		this.name = name;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	public void drive(){
		System.out.print(name+" is driving "+car.getModel()+" in "+car.getColor()+" color");
		car.engine();
	}
	
	
}
