package com.sc.oops.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Collection_Set {
	public static void set() {
		Set<Object> s = new HashSet<Object>();//upcasting
		//hashset random order
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add("rose");
		
		
		int size = s.size();
		System.out.println(size);
		
		
		//get,set,indexof,removeS method won't work;
		//		boolean remove = s.remove(30);
		//		System.out.println(remove);
//		System.out.println(s);
		boolean contains = s.contains(40);
		System.out.println(contains);
		//		s.clear();
//		System.out.println(s);
		Set<Object> u = new LinkedHashSet<Object>();//upcasting
//linkedhashset insertion Order
		u.add(10);
		u.add(40);
		u.add("lily");
		u.add(60);
		u.add(90);
		u.add(60);//duplicate
		
		
		System.out.println("u---->"+u);
//		boolean addAll = u.addAll(s);//duplicate will be removed in s(union)
//		System.out.println(addAll);
//		System.out.println(u);
//		boolean retainAll = u.retainAll(s);//common elements is in output
//		System.out.println(u);
		u.removeAll(s);//common elements are removed
		System.out.println(u);
	}//looping is possible
public static void main(String[] args) {
		set();

	}

}
