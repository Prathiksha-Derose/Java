package com.sc.oops.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input_MismatchException {//Runtime exception
	
	private static void exception() {
		System.out.println("please enter the input");
		try {
		Scanner scan =new Scanner(System.in);
		int i=scan.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Please enter correct match");
		}
	}

	public static void main(String[] args) {
		exception();

	}

	

}
