package com.OOPS;

public class Audi extends Car {
	Audi(int x, int y) {
		super(x, y);
		System.out.print("This Is Para Audi ");
	}

	void Audi() {
		System.out.print("This Is Def Audi");
	}
	
	public static void main(String args[]) {
		Audi a = new Audi(5, 7);
		a.Audi();
	}
}

class Main {
	
}