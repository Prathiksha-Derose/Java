package com.sc.oops.programs;

public class Factorial_Number {
	
	public static void factorial() {
		
		//5*4*3*2*1=120
		int num=5;
		int fact =1;
		
		for(int i=1;i<=num;i++) {
			fact= fact*i;//(1*1)(1*2)(2*3)(6*4)(24*5)
		}
		
		System.out.println("The factorial of "+num+" is "+fact);
	}

	public static void main(String[] args) {
		factorial();

	}

}
