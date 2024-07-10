package com.sc.oops.programs;

public class Swapping {
	
    static int a=10;
	static int b=20;
	static int temp;
	public static void swapWithout() {
		
		System.out.println("Before swapping a= "+a+" b= "+b);
		
		a=a+b;//30
		b=a-b;//10
		a=a-b;//20
		
		System.out.println("After swapping a= "+a+" b= "+b);
	}
	
	public static void swapWith() {
		
		temp=a;//10
		a=b;//20
		b=temp;//10
		
		System.out.println("After swapping a= "+a+" b= "+b);
		
	}

	public static void main(String[] args) {
	swapWithout();
//		swapWith();

	}

}
