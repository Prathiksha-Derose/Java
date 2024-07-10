package com.sc.oops.programs;

public class PrimeNum {
	
	public static void Prime() {
		String PrimeNumber="";
		
		for(int i=1;i<=20;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
		if(count==2) {
			PrimeNumber = PrimeNumber+i+" ";
		}
		
	}
		System.out.println(PrimeNumber);
	}
		
		
//		int count =0;
//		int num=13;
//		for(int i=1;i<=num;i++) {
//			if(num%i==0) {
//				count++;
//			}
//		}
//		if(count==2) {
//			System.out.println(num+"is a prime number");
//		}else {
//			System.out.println(num+"is not a prime number");
//		}
//	}

	public static void main(String[] args) {
		Prime();

	}

}
