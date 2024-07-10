package com.sc.oops.programs;

public class StringDuplicate {
	public static void duplicate() {
		String s1="Good Morning";
		String l=s1.toLowerCase();
		System.out.println(l);
		int count=1;//g o d m r n i
//		int count;//(only duplicates will be printed)
		char[] charArray=l.toCharArray();
		for(int i=0;i<s1.length();i++) {
//			count=1;//g o n
			for(int j=i+1;j<s1.length();j++) {
				if(charArray[i]==charArray[j]&&charArray[i]!=' ') {
					count++;
					charArray[j]='0';
				}
			}
			if(count>1&&charArray[i]!='0') {
				System.out.println(charArray[i]+" ");
			}
		}
		
	}
	

	public static void main(String[] args) {
		duplicate();

	}

}
