package com.sujata.training;

import com.sujata.demo.Difference;
import com.sujata.demo.Divide;
import com.sujata.demo.Multiply;
import com.sujata.demo.Sum;

public class Calculator {

	private int number1,number2,result;
	private char operator;
	
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	
	public void setOperator(char operator) {
		this.operator = operator;
	}
	
	public int getResult() {
		switch(operator){
		case '+':
			Sum sOb=new Sum();
			sOb.setNumber1(number1);
			sOb.setNumber2(number2);
			result=sOb.getSum();
			break;
		case '-':
			Difference dOb=new Difference();
			dOb.setNumber1(number1);
			dOb.setNumber2(number2);
			result=dOb.getDifference();
			break;
		case '*':
			Multiply mOb=new Multiply();
			mOb.setNumber1(number1);
			mOb.setNumber2(number2);
			result=mOb.getMultiply();
			break;
		case '/':
			Divide divOb=new Divide();
			divOb.setNumber1(number1);
			divOb.setNumber2(number2);
			result=divOb.getDivide();
			break;
		}
		return result;
	}
	
	
}
