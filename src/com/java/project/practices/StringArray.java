package com.java.project.practices;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// with new keyword
		char ch[] = { 'w', 'e', 'l', 'c', 'o', 'm', 'e' };
		String s = new String(ch);
		System.out.println(s);
		System.out.println("5555555555555555555555555555555555");
		
		String c = new String("javatest");
		// without new keyword
		String s2 = "wel come to java";// string litral method.
		System.out.println(s2);
		// we can not modified string litral
		String newobject = s2.concat(" home");// concat use to add
		System.out.println(s2);
		System.out.println(newobject);// new object is created.
	}

}

