package com.sujata.demo;

import java.util.Scanner;

public class MyMainAgeInput {

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		try{
		InputAge iOb=new InputAge();
		
		System.out.println("Enter Age : ");
		int a=sc.nextInt();
		
		iOb.setAge(a);
		System.out.println("Age = "+iOb.getAge());
		}
		catch(MyAgeException ex){
			System.out.println(ex.getMessage());
		}
	}
}
