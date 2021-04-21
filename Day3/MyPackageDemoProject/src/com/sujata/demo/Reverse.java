package com.sujata.demo;

public class Reverse {

	private int number,reverse;

	public void setNumber(int number) {
		this.number = number;
	}

	public int getReverse() {
		reverse=0;
		int remainder;
		while(number!=0){
			remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		return reverse;
	}

	//default
	void show(){
		System.out.println("Hi I am show method!");
	}
	
	
}
