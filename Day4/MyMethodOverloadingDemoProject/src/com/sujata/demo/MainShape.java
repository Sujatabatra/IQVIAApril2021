package com.sujata.demo;

public class MainShape {

	public static void main(String[] args) {
		Shapes shape=new Shapes();
		System.out.println("Area of Rectangle : "+shape.area(4, 8));
		
		System.out.println("Area of Square : "+shape.area(7));

		System.out.println("Area of Circle : "+shape.area(6.7));
		
	}

}
