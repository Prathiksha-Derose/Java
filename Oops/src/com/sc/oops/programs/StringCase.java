package com.sc.oops.programs;

public class StringCase {

	public static void main(String[] args) {
		String s1="FULL STACK DEVELOPMENT";
		String[] split=s1.split(" ");
		String s2="";
		String u="";
		String v="";
		int length =split.length-1;
		
		for(int i=0;i<=length;i++) {
			
			String word=split[i];
			for(int j=0;j<=word.length()-1;j++) {
				if((j%2==0&&(i==0)||(j%2==0&&(i==1)) || (j%2!=0&&i==2))){
			      String  uu=u+word.charAt(j);
					 s2=s2+uu.toUpperCase();
				}
				else {
					String vv=v+word.charAt(j);
					s2=s2+vv.toLowerCase();
				}
			}
			s2=s2+" ";
          	}
		System.out.println(s2);

	}

}
