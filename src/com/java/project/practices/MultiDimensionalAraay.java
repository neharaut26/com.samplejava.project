package com.java.project.practices;

public class MultiDimensionalAraay {

	public static void main(String[] args) {
		//declairation types of array
		int[][]	array;
		int [][]array1;
		//int array2[][];	
		int[] array3[];	
		
		//instantiate of array
		int array2[][]=new int[2][2];
				//length is decide by row
		
		//seprate intialization of array
		array2[0][0]=10;
		array2[0][1]=20;
		array2[1][0]=30;
		array2[1][1]=10;
		System.out.println(array2.length);
		System.out.println(array2[0][1]);
				
	
	}
}
