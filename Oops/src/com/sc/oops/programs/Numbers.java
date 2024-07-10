package com.sc.oops.programs;

public class Numbers {
	
	public static void evenOdd() {
		int n1;
		for(n1=1;n1<=20;n1++) {
			
			if(n1%2==0) {
				System.out.println(n1+" is even");
			}
			else {
				System.out.println(n1+" is odd");
			}
		}
	}

	public static void main(String[] args) {
		evenOdd();

	}

}
