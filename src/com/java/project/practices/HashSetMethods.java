package com.java.project.practices;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMethods {

	public static void main(String[] args) {
		Set<String> hashset = new HashSet<>();
		hashset.add("amit");
		hashset.add("neha");
		hashset.add("shantnu");
		hashset.add("krithya");
		hashset.add("amit");
		hashset.add(null);
		//hashset.clear();
		Set<String> b = new HashSet();
		b.add("amit");
		b.add("kakde");
		b.add("dcdc");
		b.add("neha");
		hashset.add("vb");
		hashset.addAll(b);
		hashset.removeAll(b);
		hashset.retainAll(b);
		//hashset.remove("amit");
		System.out.println(hashset.isEmpty());
		
		
		//System.out.println(hashset.contains("amit"));
		Iterator<String> it = hashset.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		

	}

}
