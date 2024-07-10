package com.sc.oops.programs;

public class Sample {
	//Constructor overload 
	
	public Sample() {//access modifier,classname
		System.out.println("Constructor ");
	}
	public Sample(int i) {
		System.out.println("THis is Number Constructor ");
	}
	public void m1() {//access modifier, modifier, return type, method name
		System.out.println("Hello");
	}
	

	public static void main(String[] args) {
		
        System.out.println("Hello Main");
        Sample s1= new Sample();
        Sample s2=new Sample(2);
        s1.m1();
        System.out.println("Bye");
	}

}
