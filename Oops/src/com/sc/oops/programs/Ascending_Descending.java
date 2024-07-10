package com.sc.oops.programs;

import java.util.Arrays;
import java.util.Collections;

public class Ascending_Descending {
	
	public static void ascending() {
		int[] a= {56,43,22,90,11,5,78,65};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {//(56,43)(56,22)(56,11)(56,5)(43,22)(43,11)(90,43)(90,56)(90,78)(90,65)(65,43)(65,56)(56,43)
				int temp=a[i];//56
				a[i]=a[j];//      43,22,11,5,22,11,43,56,78,65,43,56
				a[j]=temp;//      56,56,56,56,43,43,90,90,90,90,65,65
				//0,5	  5,43,22,90,11,56,78,65    5,11,22,90,43,56,78,65   same  5,11,22,65,43,56,78,90  same   same  same
				//same    same    same   5,11,22,56,43,65,78,90   same   same same same
				//same    same    same   5,11,22,43,56,65,78,90   same   same same same
				}}}
		
//		for(int array : a) {
//			System.out.println("ascending"+array);
//		}
		System.out.println("Ascending Order"+Arrays.toString(a));
		System.out.println("Minimum number is"+a[0]);
		System.out.println("Maximum number is "+a[a.length-1]);
	}
	public static void descending() {
		Integer[] a= {56,43,22,90,11,5,78,65};
		
        Arrays.sort(a,Collections.reverseOrder());
        
        System.out.println("Descending Order"+Arrays.toString(a));
		
//		for(int array : a) {
//			System.out.println("descending"+array);
//		}
	}

	public static void main(String[] args) {
		ascending();
		descending();
		}
}
