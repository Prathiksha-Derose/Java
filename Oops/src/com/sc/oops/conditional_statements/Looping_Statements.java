package com.sc.oops.conditional_statements;

import java.util.Scanner;

public class Looping_Statements {
	
	public static void while_method(int n) {
		
		while(n==100) {
			
			n+=1;
			System.out.println(n);
	}
}		
		public static void  do_while_method(int n) {
			do{
				n++;
				System.out.println(n);
				
			}
			while(n==100);
			
		}


	public static void main(String[] args) {
		
		Looping_Statements ls= new Looping_Statements();
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Integer");
		int n=scan.nextInt();
//		ls.while_method(n);
//		ls.do_while_method(n);
		
		while_method(n);
		do_while_method(n);

	}
}
