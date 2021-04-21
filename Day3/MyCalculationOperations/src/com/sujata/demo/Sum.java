package com.sujata.demo;
/*
 * Encapsulation : class
 * Data Hiding : private access specifier
 * Data Abstraction : method
 */
public class Sum {

	private int number1,number2,sum;

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int getSum() {
		sum=number1+number2;
		return sum;
	}
	
	
}
