package com.sc.oops.scanner;

import java.util.Scanner;

public class Scanner_demo {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String a=scan.next();
		System.out.println("a =" +a);
		
		String b=scan.nextLine();
		System.out.println("b=" +b);
		
		int c=scan.nextInt();
		System.out.println("c=" +c);
		
		float f=scan.nextFloat();
		System.out.println(f);
		
		char d=scan.next().charAt(3);
		System.out.println("d=" +d);

	}

}
