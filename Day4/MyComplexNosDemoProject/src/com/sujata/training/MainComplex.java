package com.sujata.training;

import com.sujata.demo.Complex;

public class MainComplex {

	public static void main(String[] args) {
		Complex c1=new Complex(); //declaring
		c1.input(5, 4);   //initializing
		
		Complex c=new Complex();
		c.input(7, -8);
		
		c.display();
		c1.display();
		
		Complex c3=new Complex();
		c3.addComplex(c1, c);
		System.out.print(" Sum  : ");
		c3.display();
	}

}
