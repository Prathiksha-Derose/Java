package com.sc.oops.exception;

public class String_IndexException {
	
	public static void stringException() 
	{
		String s="rose";
		try {
		for(int i=0;i<=s.length();i++) {
		char c	=s.charAt(i);
			System.out.println(c);
		}
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("The given index is not available");
			
		}
		
		
		
		
	}

	public static void main(String[] args) {
		stringException();

	}

}
