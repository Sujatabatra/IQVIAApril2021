package com.sujata.demo;

public class Difference {

	private int number1,number2,difference;

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int getDifference() {
		difference=number1-number2;
		return difference;
	}
}
