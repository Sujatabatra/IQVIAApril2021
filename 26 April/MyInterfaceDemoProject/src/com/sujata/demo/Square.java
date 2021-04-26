package com.sujata.demo;

public class Square extends InputNumber implements NonRoundedShape {

	@Override
	public void area() {
		int area=getNumber()*getNumber();
		System.out.println("Area of Sqaure : "+area);

	}

	@Override
	public void perimeter() {
		int per=4*getNumber();
		System.out.println("Perimeter of Square : "+per);

	}

}
