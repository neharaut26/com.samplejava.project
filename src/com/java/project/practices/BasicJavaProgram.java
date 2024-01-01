package com.java.project.practices;

public class BasicJavaProgram {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("hiiiiiiii");
		
		//operators
		//uniry
		int d=10;
		int e=20;
		int f=5;
		int g=8;
		
		System.out.println(++d);
		System.out.println(--e);
		System.out.println(f++);
		System.out.println(f);
		System.out.println(g--);
		System.out.println(g);
		
		 
		//arithmatic opearator
		
		int a=10;
		int b=20;
		System.out.println(a+b);
		System.out.println(a%b);
		
		//relational opearator
		
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=10);
		System.out.println(b>=14);
		System.out.println("###############################");
		
		//logical opearators
		int c=15;
		boolean v;
       v= a<b && c<b;
       System.out.println(v);
		v=a>b&& b<c;
		System.out.println(v);
		v= a<b||b>c;
		System.out.println(v);

	}

}
