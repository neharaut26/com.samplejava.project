package com.java.project.practices;

import java.util.ArrayList;

public class ListInterfaceImplementation {

	public static void main(String[] args) {
	ArrayList arraylist= new ArrayList();
	
		arraylist.add(200);
		arraylist.add(34.5f);
		arraylist.add("neha");
		//when we will going to create for loop it will give error 
		//in diffrent data type,so we use object as a integer
		
		for(Object o :arraylist) {
			System.out.println(o.toString());
			
		}
		
		System.out.println("*************************************");
		
		//by using generalization 
		ArrayList<Integer> arraylist1= new ArrayList<Integer>();
		arraylist1.add(500);
		arraylist1.add(200);
		arraylist1.add(null);
		arraylist1.add(200);
		for (Integer b :arraylist1) {
			System.out.println(b);
		}
		System.out.println(arraylist1.get(0));
		//it will add 500 in 3rd index .
	//System.out.println(arraylist1.add(3));	

		
		
		

	}

}
