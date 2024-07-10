package com.sc.oops.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Collection_map {

	public static void main(String[] args) {

		Map<Integer,Object> map=new HashMap<Integer, Object>();
		map.put(1, "rose");
		map.put(2, 'P');
		map.put(3, 56.9);
		map.put(4, 100);
		map.put(5, "lily");
		
		System.out.println(map.size());
		
		//put,size,get,keySet,values,containsKey,containsValue,entrySet
		
		
		Object get = map.get(5);//key
		System.out.println(get);
		
		Set<Integer> keyset=map.keySet();
		System.out.println(keyset);

	}

}
