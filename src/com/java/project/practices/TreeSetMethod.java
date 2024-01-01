package com.java.project.practices;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetMethod {

	public static void main(String[] args) {
		Set<Integer> b = new TreeSet<>();
		b.add(200);
		b.add(300);
		b.add(50);
		b.add(30);
		b.add(700);
	//not store	//b.add(null);
		
		
		
		Iterator<Integer> it = b.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		}

}
