package com.java.project.practices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListMethod {

	public static void main(String[] args) {
		ArrayList<Integer> adharno1 = new ArrayList<Integer>();
		adharno1.add(12345);
		adharno1.add(12);
		adharno1.add(123);
		adharno1.add(1234);
		adharno1.add(12349);
		//add method is use to add element in that index.
		//adharno1.add(3, 11111);
		//adharno1.remove(2);
	
		Collections.sort(adharno1);//use to sort in ascending order.
		Collections.sort(adharno1,Collections.reverseOrder());
		for(Integer b :adharno1) {
			System.out.println(b);
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		ArrayList<Integer> adharno2 = new ArrayList<Integer>();
		adharno2.add(100);
		adharno2.add(200);
		adharno2.add(300);
		adharno2.add(400);
		//adharno1.addAll(adharno2);
		//adharno1.removeAll(adharno2);
		
		for(Integer v :adharno1) {
			System.out.println(v);
		}
		System.out.println("#########################################");
		System.out.println(adharno1.get(0));
		System.out.println("#########################################");
		ArrayList<Integer> adharno3 = new ArrayList<Integer>();
		adharno3 .add(500);
		adharno3 .add(270);
		adharno3 .add(700);
		adharno3 .add(600);
		Iterator<Integer> it = adharno3.iterator(); 
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
