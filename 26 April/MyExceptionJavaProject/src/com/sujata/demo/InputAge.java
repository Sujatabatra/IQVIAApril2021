package com.sujata.demo;

public class InputAge {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age)throws MyAgeException {
		if(age<18)
			throw new MyAgeException("Age cannot be less than 18");
		this.age = age;
	}
	
	
}
