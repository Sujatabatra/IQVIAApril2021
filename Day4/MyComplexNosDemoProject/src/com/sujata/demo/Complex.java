package com.sujata.demo;

public class Complex {
	
	private int real,imag;

	public int getReal() {
		return real;
	}

	public void setReal(/*localvariable*/int real) {
		this.real = real;
		//instance variable=localvariable
	}

	public int getImag() {
		return imag;
	}

	public void setImag(int imag) {
		this.imag = imag;
	}
	
	public void input(int real,int imag){
		this.real=real;
		this.imag=imag;
		
	}
	public void display(){
		System.out.print(real);
		if(imag>0)
			System.out.println("+"+imag+"i");
		else if(imag<0)
			System.out.println(imag+"i");
	}
	
	public void addComplex(Complex c1,Complex c2){
		this.real=c1.real+c2.real;
		this.imag=c1.imag+c2.imag;
				
	}
	
	

}
