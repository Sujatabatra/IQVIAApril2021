package com.sujata.demo;

public class Height {

	private int feet,inches;

	public int getFeet() {
		return feet;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}
	
	public void addHeight(Height h1,Height h2){
		inches=h1.inches+h2.inches;
		feet=h1.feet+h2.feet;
		
	}
}
