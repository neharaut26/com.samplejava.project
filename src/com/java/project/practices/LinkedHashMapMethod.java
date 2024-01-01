package com.java.project.practices;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapMethod {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> link =  new LinkedHashMap<>();
		link.put(12345, "neha");
		link.put(12346, "sachin");
		link.put(12343, "sachin");
		link.put(12346, "pooja");
		link.put(12348, "ritu");
	Set<Entry<Integer, String>> m	 =link.entrySet();
	Iterator<Entry<Integer, String>> it = m.iterator();
	while(it.hasNext()) {
		Entry<Integer, String> it1 =it.next();
		System.out.println(it1.getKey()+" = "+it1.getValue());
		
	}
	}

}
