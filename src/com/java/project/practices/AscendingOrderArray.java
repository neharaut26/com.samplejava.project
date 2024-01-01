package com.java.project.practices;

public class AscendingOrderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int array[] = { 1, 3, 2, 65, 34, 200, 43 };//instantiation and declairation of array

		// length=7
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");//to print original array values
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {//compare indices with adjoining indices
					a = array[i];
					array[i] = array[j];
					array[j] = a;

				}

			}
		}
		System.out.println();//to print next line

		System.out.println("the ascending numbers are ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");//printing asscending order values
		}
		System.out.println();

		System.out.println("the descending numbers are");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");//printing descending order values
		}

	}

}
