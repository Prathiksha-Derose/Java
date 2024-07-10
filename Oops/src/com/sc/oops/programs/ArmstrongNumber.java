package com.sc.oops.programs;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void armstrong() {

		int n=567;
		int copy=n;
		int rem;
		int sum=0;
		
		
		while(n>0) {
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}
		if(sum==copy) {
			System.out.println(sum+" is a armstrong number");
		}
		else {
			System.out.println(sum+" is not a armstrong number");
		}
	}
			
		
	

	public static void main(String[] args) {
		armstrong();

	}

}
