package com.sujata.demo;

/*
 * Constructors are used to initialise objects at the time of declaration
 * Rule for Constructors
 * 1. Constructor name is same as that of your class name
 * 2. Constructor cannot return a value not even void
 * 3. Constructor can be argumented and non argumented
 * 4. Constructor can be in any scope : private , public, default
 * 
 * Note : when our class don't have any programmer defined constructor , 
 * then compiler creates a default constructor for our class which initialise variables with default initial values
 * i.e int=0,long=0, float=0.0f, double=0.0,String=null, object=null,boolean=false
 * but if class have even if one programmer defined constructor , then compiler will not provide any constructor to us
 */
public class Complex {

	private int real, imag;
	/*
	 * Zero argument constructor : default constructor
	 */
	/*
	 * Constructor overloading: multiple constructors and each constructor is differentiated from one another wrt its signature
	 * signature means no and types of arguments and its sequence
	 * 
	 * Polymorphism : Constructor Overloading
	 */
	 public Complex(){
	 real=4;
	 imag=3;
	 }

	public Complex(int real, int imag) {
		super();
		this.real = real;
		this.imag = imag;
	}

	public Complex(int real){
		this.real=real;
		imag=9;
	}
	public void input(int real, int imag) {
		this.real = real;
		this.imag = imag;

	}

	public void display() {
		System.out.print(real);
		if (imag > 0)
			System.out.println("+" + imag + "i");
		else if (imag < 0)
			System.out.println(imag + "i");
	}

	public void addComplex(Complex c1, Complex c2) {
		this.real = c1.real + c2.real;
		this.imag = c1.imag + c2.imag;

	}

}
