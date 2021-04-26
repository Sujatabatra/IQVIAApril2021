package com.sujata.demo;

import java.util.Scanner;

public class MyFinallyDemoClass {

	public static void divide(int number1,int number2){
		try{
			int result=number1/number2;
			System.out.println("result = "+result);
			System.out.println("Good bye from try block!");
			return;
		}
		catch(ArithmeticException ex){
			System.out.println("Infinite");
		}
		finally{
			System.out.println("Hi I am finally block!");
		}
		System.out.println("Good bye from divide method");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first no : ");
		int no1=sc.nextInt();
		System.out.println("Enter second no : ");
		int no2=sc.nextInt();
		divide(no1,no2);
		System.out.println("Good bye from main!");
	}

}
