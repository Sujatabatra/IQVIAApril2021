package com.sujata.demo;

import java.util.Scanner;

public class MySecondThrowsDemoClass {

	public static void divide(int number1,int number2)throws ArithmeticException{
		
			int result=number1/number2;
			System.out.println("result = "+result);
			System.out.println("Good bye from try block!");
			
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
		System.out.println("Enter first no : ");
		int no1=sc.nextInt();
		System.out.println("Enter second no : ");
		int no2=sc.nextInt();
		divide(no1,no2);
		}catch(ArithmeticException e){
			System.out.println("Infinity");
		}
		System.out.println("Good bye from main!");
	}

}
