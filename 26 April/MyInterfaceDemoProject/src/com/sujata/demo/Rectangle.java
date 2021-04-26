package com.sujata.demo;

public class Rectangle implements NonRoundedShape {

	private int length,breadth;
	
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void area() {
		int area=length*breadth;
		System.out.println("Area of Rectangle : "+area);

	}

	@Override
	public void perimeter() {
		int peri=2*(length+breadth);
		System.out.println("Perimeter of Rectangle : "+peri);

	}

}
