package com.java.project.practices;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkLIstMethod {

	public static void main(String[] args) {
		LinkedList<Integer> adharno1 = new LinkedList<Integer>();
		adharno1.add(12345);
		adharno1.add(12346);
		adharno1.add(12347);
		adharno1.add(12348);
		adharno1.add(12349);
		//add method is use to add element in that index.
		adharno1.add(3, 11111);
		adharno1.remove(2);
		
		for(Integer b :adharno1) {
			System.out.println(b);
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		LinkedList<Integer> adharno2 = new LinkedList<Integer>();
		adharno2.add(100);
		adharno2.add(200);
		adharno2.add(300);
		adharno2.add(400);
		
		adharno1.addAll(adharno2);
		//adharno1.removeAll(adharno2);
		
		for(Integer v :adharno1) {
			System.out.println(v);
		}
		System.out.println("#########################################");
		System.out.println(adharno1.get(0));
		System.out.println("#########################################");
		LinkedList<Integer> adharno3 = new LinkedList<Integer>();
		adharno3 .add(500);
		adharno3 .add(270);
		adharno3 .add(700);
		adharno3 .add(600);
		Iterator<Integer> decitr = adharno3.descendingIterator(); 
		while(decitr.hasNext()) {
			System.out.println(decitr.next());
		}
		

		
		
		
		
		
		
	}

}
