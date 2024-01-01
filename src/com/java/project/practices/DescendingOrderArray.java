package com.java.project.practices;

public class DescendingOrderArray {

	public static void main(String[] args) {
		
		
		int a[]= {1,3,2,65,34,200,43};
		int b= 0;//
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]<a[j]) {
				b= a[i];
				a[i]=a[j];
				a[j]=b;
				
			}
		}
		}
		System.out.println();
		
	System.out.println("descending order no are");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}

	}

}
