package com.java.project.practices;

public class Array {

	public static void main(String[] args) {
		//declaration type of array
		//int[] array;
		int []array1;
		int array2[];		
		
		//int array[]= new int[7] ;//instantiation of array
		/*
		 * array[0]=20; array[1]=30; array[2]=40; array[3]=50; array[4]=60; array[5]=70;
		 * array[6]=80;//initialization of array
		 */
		int array[] = {20,30,40,50,60,70,80};	//2nd method of instantiation/declairation and intializationkagkag of array
	System.out.println(array.length);
	
	System.out.println("##############");
	
	  for(int i=0;i<array.length;i++) {
		  System.out.println(array[i]);
	  }
	  System.out.println("#########################################");
	  for(int e:array) {
		  System.out.println(e);
	  }
	  
		
	}

}
