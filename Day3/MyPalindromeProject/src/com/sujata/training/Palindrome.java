package com.sujata.training;

import com.sujata.demo.Reverse;

public class Palindrome {

	private int number;
	private boolean palindrome;
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public boolean isPalindrome() {
		Reverse rOb=new Reverse();
		rOb.setNumber(number);
		if(number==rOb.getReverse())
			palindrome=true;
		else
			palindrome=false;
		return palindrome;
	}
	
	
}
