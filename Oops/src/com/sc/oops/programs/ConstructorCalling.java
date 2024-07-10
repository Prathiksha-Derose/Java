package com.sc.oops.programs;

public class ConstructorCalling {
	
	public ConstructorCalling() {
	this("Hello");
	System.out.println("This is default constructor");
	}
	
public ConstructorCalling(int a) {
		this(10.7);
		System.out.println("This is integer");
	}

public ConstructorCalling(String b) {
	this(10);
	System.out.println("THis is String");
}

public ConstructorCalling(double c) {
	System.out.println("This is double");
}

	public static void main(String[] args) {
		
		ConstructorCalling call =new ConstructorCalling();
		

	}

}
