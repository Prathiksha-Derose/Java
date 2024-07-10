package com.sc.oops.onedimensionalstandard;

import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionalArray {

	public static void main(String args[]) {
        int[] a = new int[3]; // Declaration
        a[0] = 10; // Initialization
        a[1] = 20;
        a[2] = 30;
        // Printing array
        System.out.println("One-dimensional array elements are");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        
        

        System.out.println("One-dimensional array using loop");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    
	
	int len;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array length: ");
    len = sc.nextInt();
   int b[] = new int[len]; // Declaration
    System.out.print("Enter " + len + " Element to Store in Array:\n");
    for (int i = 0; i < len; i++) {
        b[i] = sc.nextInt(); // Read and store elements
    }
    System.out.print("Elements in Array are:\n");
    for (int i = 0; i < len; i++) {
        System.out.print(b[i] + " ");
    }
    
    //for each
    for(int c:a) {
    	System.out.println(c);
    }
    //Arrays
    System.out.println("Arrays"+Arrays.toString(a));
}

    
}

