package com.sujata.demo;

public class ButterPopCorn extends PopCorn {

	//modifying the behaviour of base class method : by over riding
	/*
	 * Overriding rule:
	 * 1. function name and argument must be same
	 * 2. overiridng can happen in base and dervived class
	 * 3. while overriding base class methos, you can broader the scope of the method 
	 * or can override in same scope as that of parents but can't narrow down the scope 
	 * 
	 */
	public void pop() {
		System.out.println("Yummy Butterly PopCorn is Popping");
	}
}
