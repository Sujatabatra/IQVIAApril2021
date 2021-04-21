package com.batra.training;

import com.sujata.training.Calculator;

public class MyCalculatorMain {

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		calculator.setNumber1(10);
		calculator.setNumber2(5);
		calculator.setOperator('-');
		System.out.println("Result : "+calculator.getResult());
		

	}

}
