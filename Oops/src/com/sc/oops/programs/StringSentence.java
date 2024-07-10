package com.sc.oops.programs;

public class StringSentence {
	public static void sentenceRev() {
		String s="Happy Coding fun java";
		String[] split=s.split(" ");
		String b="";
		for(String word : split) {
			
				for(int j=word.length()-1;j>=0;j--) {
					char d=word.charAt(j);
					b=b+d;
				}
				b=b+" ";
			}
		System.out.println(b);	
	}
		
	
	public static void main(String[] args) {
		sentenceRev();

	}

}
