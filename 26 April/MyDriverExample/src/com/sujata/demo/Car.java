package com.sujata.demo;
/*
 * 1.If even a single method is abstract in a class, its mandatory to mark that class also as abstract
 * 2. we can have abstract method and abstract class
 * 3. abstract method is the method without body but a contract with child class to give abstract method body
 * 4. we can't instantiate abstract class , i.e we can't create object of abstract class
 */
public abstract class Car {

	private String color,model;

	public Car(String color, String model) {
		super();
		this.color = color;
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}
	
	//parents is saying child : I dont know how engine works but once you become my child give your own version of engine
	//Tyhe decision by parent was communicated to the child verbally , which leads problem
//	public void engine(){
//		
//	}
	//specifying that child class must implement the abstract method
	abstract public void engine();
}
