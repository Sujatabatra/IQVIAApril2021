package com.sujata.demo;

public class Grade extends Marks {

	private String grade;
	
	public void calculateGrade(){
		double percentage=(getMarks1()+getMarks2()+getMarks3())/3;
		if(percentage > 75)
			grade="A Grade";
		else
			grade="B Grade";
	}

	public String getGrade() {
		return grade;
	}
	
	
}
