package com.sc.oops.string;

import java.util.Arrays;

public class String_Methods {
	
	private static void methods() {
		
		
//		1.length()
//		2.equals()
//		3.equalsIgnoreCase()
//		4.toUpperCase()
//		5.toLowerCase()
//		6.startsWith()
//		7.endsWith()
//		8.contains()
//		9.indexOf()
//		10.lastIndexOf()
//		11.charAt()
//		12.replace()
//		13.subString()
//		14.isEmpty()
//		15.split()
//		16.trim()
//		17.compareTo(-)
		
		String s="Prathiksha_Derose";
		
		String t="derose";
		
		String q="Derose";
		
		String empty=" ";
		
		String sentence="Good morning chennai";
		
		String sentence1="Good morning chennai"; 
		
		int a =s.length();
		System.out.println(a);

		boolean b=s.equals(t);
		System.out.println(b);

		boolean c=q.equalsIgnoreCase(t);
		System.out.println(c);

		String d=s.toUpperCase();
		System.out.println(d);

		String e=s.toLowerCase();
		System.out.println(e);

		boolean f=s.startsWith("Der", 11);//0 starts
		System.out.println(f);

		boolean g=s.startsWith("P");
		System.out.println(g);

		boolean h=s.endsWith("se");
		System.out.println(h);

		boolean i=s.endsWith("se");
		System.out.println(i);

		//index of(1 st index of e)
		int j=s.indexOf("Der");
		System.out.println(j);

		int indexof=s.indexOf('e');
		System.out.println(indexof);
//====================================
		//last index of(last index of char)
		int k=s.lastIndexOf('a');
		System.out.println(k);

		int l=s.lastIndexOf("se",13);
		System.out.println(l);

	//==========================================
		char m=s.charAt(9);
		System.out.println(m);

		String n=s.replace('e','1');
		System.out.println(n);


		//substring
		String o=s.substring(10, 17);
		System.out.println(o);

		String p=s.substring(0,10);//last index wont be included
		System.out.println(p);
		
		CharSequence subquence=s.subSequence(11, 17);
		System.out.println(subquence);
		
		boolean r=empty.isEmpty();//space is considered as false
		System.out.println(r);

		String[] split=sentence.split(" ");
		System.out.println(Arrays.toString(split));
		
	}

	public static void main(String[] args) {
		methods();

	}

}
