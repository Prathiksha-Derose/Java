package com.sc.oops.programs;

import java.util.Scanner;

public class Palindrome {
	
	static Scanner scan=new Scanner(System.in);
	
	public static void palindromeNum() {
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int copy=num;
	     int rem = 0,sum = 0;
		while(num>0) {//897
			rem=num%10;//7,9
			sum=(sum*10)+rem;//7,(70+9)79,790+8)
			num=num/10;
			
		}
		if(sum==copy) {
			System.out.println(copy+" is a palindrome");
		}else {
			System.out.println(copy+" is not a palindrome");
		}
		
	}

	public static void palindromeString() {
		System.out.println("Enter the String");
		String s=scan.nextLine();
        String copy=s;
        
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
			
		}
		System.out.println(s1);
		if(s1.equals(copy)) {
			System.out.println(s1+" is a palindrome");
		}else {
			System.out.println(s1+" is not a palindrome");
		}
	}
	public static void main(String[] args) {
//		palindromeNum();
		palindromeString();

	}

}
