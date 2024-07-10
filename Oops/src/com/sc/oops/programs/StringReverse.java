package com.sc.oops.programs;

public class StringReverse {
	
	public static void stringRev() {
		String s="prathi";
		String s1="";
		
		
		for(int i=s.length()-1;i>=0;i--) {
			char s2=s.charAt(i);
			s1=s1+s2;
			}
		System.out.println(s1);
		
	}
	
	public static void sentenceStringRev() {
		String a="Nice To See You";
		String[] split=a.split(" ");
		String b="";
		
		for(int i=0;i<split.length;i++) {//array length
			String c=split[i];
			for(int j=c.length()-1;j>=0;j--) {//string length()
				char d=c.charAt(j);
				b=b+d;
			}
			b=b+" ";
		}
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		stringRev();
//		sentenceStringRev();

	}

}
