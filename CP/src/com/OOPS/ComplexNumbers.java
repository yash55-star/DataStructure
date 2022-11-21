package com.OOPS;

public class ComplexNumbers {
	
	
	int real;
	
	int imaginary1;
	
	public ComplexNumbers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComplexNumbers(int real, int imaginary1) {
		super();
		this.real = real;
		this.imaginary1 = imaginary1;
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImaginary1() {
		return imaginary1;
	}

	public void setImaginary1(int imaginary1) {
		this.imaginary1 = imaginary1;
	}

	public void plus(ComplexNumbers c2) {
		this.imaginary1 = this.imaginary1 + c2.imaginary1;
		this.real = this.real + c2.real;
		
	}

	public void print() {
		System.out.print(this.real +" +i"+ this.imaginary1);
		
	}

	public void multiply(ComplexNumbers c2) {
		int real = this.real * c2.real - this.imaginary1 * c2.imaginary1;
		int imaginary1 = this.real * c2.imaginary1 + this.imaginary1 * c2.real;
		this.imaginary1 = imaginary1;
		this.real = real;
		
		/*
		 * int real1 = this.real; int real2 = c2.real; int imaginary1 = this.real; int
		 * imaginary2 = c2.real;
		 * 
		 * this.real = real1 * real2 - imaginary1 * imaginary2; int real1 = this.real;
		 * this.imaginary1 = real1 * imaginary1 + imaginary1 * real2;
		 */
	}
	
	

}
