package com.sujata.demo;

public class MatricesMain {

	public static void main(String[] args) {
		Matric m1=new Matric(3, 4);
		
		Matric m2=new Matric(3, 4);
		
		m1.inputMatric();
		
		m2.inputMatric();
		
		
		Matric m3=new Matric(3, 4);
		m3.sumMatrices(m1, m2);
		
		System.out.println("First Matric : ");
		m1.displayMatric();
		
		System.out.println("Second Matric : ");
		m2.displayMatric();
		
		System.out.println("Sum of two Matrices : ");
		m3.displayMatric();

	}

}
