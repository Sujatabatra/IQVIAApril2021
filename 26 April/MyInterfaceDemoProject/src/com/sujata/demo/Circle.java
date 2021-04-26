package com.sujata.demo;

public class Circle implements Shape, RoundedShape {

	private double radius;
	
	@Override
	public void circumference() {
	double cir=2*3.14*radius;
	System.out.println("Circumference of Cicle : "+cir);

	}

	@Override
	public void area() {
		double area=3.14*radius*radius;
		System.out.println("Area of Circle : "+area);
	}

}
