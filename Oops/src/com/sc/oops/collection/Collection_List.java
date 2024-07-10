package com.sc.oops.collection;

import java.util.ArrayList;
import java.util.List;

public class Collection_List {
	
	public static void list() {
		
		//list method
		
		List<Integer> l =new ArrayList<Integer>();
		
//		System.out.println(l.size());
		
//		l.add();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		System.out.println(l);
		for(int i=0;i<l.size();i++) {
			System.out.println(l);
//			System.out.println(l.get(i));
			Object object=l.get(i);
//			System.out.println(object);
		}
		
	}

	public static void main(String[] args) {
		list();
		
		

	}

}
