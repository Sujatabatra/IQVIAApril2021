package com.sujata.demo;

/*
 * Every checked exception is the child of Exception
 * Every unchecked exception is the child of RunTimeException
 */
public class MyAgeException extends Exception {
	
	public MyAgeException(String message){
		super(message);
	}

}
