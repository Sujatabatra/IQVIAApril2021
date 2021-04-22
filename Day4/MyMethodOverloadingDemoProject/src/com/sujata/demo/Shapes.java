package com.sujata.demo;

public class Shapes {

	//method overloading
	public int area(int length,int breadth){
		int area=length*breadth;
		return area;
	}
	
	public int area(int side){
		int area=side*side;
		return area;
	}
	
	public double area(double radius){
		double area=3.14*radius*radius;
		return area;
	}
}
