package com.java.project.practices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMethod {
	
public static void main(String[] args) {
	LinkedHashSet<Integer> b = new LinkedHashSet<>();
	ArrayList<Integer> c = new ArrayList<>(b);//to use
			b.add(100);
			b.add(200);
			b.add(300);
			b.add(100);
			b.add(null);
			b.add(500);
		b.remove(300);
		Set<Integer> n = new LinkedHashSet<>();
		n.add(700);
		n.add(800);
		n.add(900);
		b.addAll(n);
		//b.removeAll(n);
		System.out.println(b.isEmpty());
		System.out.println(b.containsAll(n));
		//b.clear();
		b.addAll(n);
		b.removeAll(n);
	b.remove(900);
		System.out.println(b.size());
		System.out.println( b.contains(800));
		Collections.sort(c);
	
		Iterator<Integer> it = b.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
		
		
				
		
		
		
		
		
		
	}

}
