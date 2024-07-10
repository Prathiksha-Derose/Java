package com.sc.oops.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Null_PointerException {
	
	public static void name() {
		String s= null;
		
		
		try {
			char c=s.charAt(2);
			System.out.println(c);
		}
		catch(ArithmeticException a){
			System.out.println("Arith metic");
		}
		catch(NullPointerException e){
			System.out.println("Null Pointer");
			
		}
		catch(InputMismatchException n){
			System.out.println("Input Mismatch");
			
		}
	}

	public static void main(String[] args) {
		name();

	}

}
