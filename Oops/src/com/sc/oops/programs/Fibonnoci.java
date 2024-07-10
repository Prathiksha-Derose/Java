package com.sc.oops.programs;

public class Fibonnoci {
	public static void series() {
		//0,1,1,2,3,5,8,13,21,34
		
		int n1=0,n2=1,n3,count=10;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=2;i<=count;i++) {
			
			n3=n1+n2;//1,2,3,5
			System.out.println(n3);
			n1=n2;//1,1,2
			n2=n3;//1,2,3
			
		}
	}

	public static void main(String[] args) {
		series();

	}

}
