package com.sc.oops.programs;

public class VowelsSwapping {
	public static void stringswap() {
		String s1="iphone";
        char[] c=s1.toCharArray();
        String s2="";
        for(int i=0;i<=c.length-1;i++) {
        	for(int j=i+1;j<=c.length-1;j++) {
        	char d=c[i];
        	char e=c[j];
        	if(((d=='a')||(d=='e')||(d=='i')||(d=='o')||(d=='u'))&&(((e=='a')||(e=='e')||(e=='i')||(e=='o')||(e=='u')))){
        		System.out.println(d+""+e);
        		char temp=d;
        		d=e;
        		e=temp;//ophine     //io  ie oe
        		System.out.println(String.valueOf(c));
//        		break;
//        		System.out.println(c[5]);
        }
//        	d='0';//
        	
        }	
        
	}
        
	}
	public static void main(String[] args) {
		stringswap();

	}
}

	
	
	