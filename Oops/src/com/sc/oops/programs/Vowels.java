package com.sc.oops.programs;

public class Vowels {
	public static void vowels() {
		String s1="Prathiksha Derose";
		String s2="";
		for(int i=0;i<=s1.length()-1;i++) {
			char c= s1.charAt(i);
			if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')){
				s2=s2+c+" ";
			}
		}
		System.out.println(s2);
	}

	public static void main(String[] args) {
		vowels();

	}

}
