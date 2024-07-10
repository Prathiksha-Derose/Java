package com.sc.oops.constructor;
public class Constructor_demo {
	
	public Constructor_demo(int a) {//parameterized constructor (5)
		this(false,'a');
		System.out.println("The integer:" +a);
	}
	
	public Constructor_demo(String b) {//parameterized constructor (1)
		System.out.println("The String:" +b);
	}
	
	public Constructor_demo(double c) {//parameterized constructor (2)
		this("derose");
		System.out.println("The double:" +c);
	}
	
	public Constructor_demo(float d,int e) {//parameterized constructor (3)
		this(45.8d);
		System.out.println("The int:" +e);
		System.out.println("The float:" +d);
	}
	
	public Constructor_demo(boolean f, char g) {//parameterized constructor (4)
		this(7.8f,98);
		System.out.println("The boolean:" +f);
		System.out.println("The char:" +g);
	}
	
	public Constructor_demo() {//default constructor (6)
		this(34);
		System.out.println("The Default constructor");
	}
	
    public static void main(String[] args) {
		Constructor_demo demo= new Constructor_demo();
	}
}
