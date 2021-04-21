package com.sujata.demo;

public class ConvertHeight {

	private int heightInInches;
	//Output variable
	private Height heightInFeetAndInches;

	public void setHeightInInches(int heightInInches) {
		this.heightInInches = heightInInches;
	}

	public Height getHeightInFeetAndInches() {
		heightInFeetAndInches=new Height();
		
		heightInFeetAndInches.setFeet(heightInInches/12);
		heightInFeetAndInches.setInches(heightInInches%12);
		
		return heightInFeetAndInches;
	}

	
}
