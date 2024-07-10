package com.sc.oops.programs;

public class FirstLastIndex {
	//first and last index of r
	public static void index() {
		String s1="Praethiksha Derose";
		String s2="";
		
		for(int i=0;i<s1.length();i++) {
			int count=0;
			char c=s1.charAt(i);
			if((c=='e')||(c=='E')){
			 count++;	
			}
			if(count==1) {
				System.out.println(i);
			}
		}
		
	}

	public static void main(String[] args) {
		index();

	}

}
