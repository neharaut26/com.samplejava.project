package com.java.project.practices;

public class InterfaceImplementation implements InterfaceInJava {
//press on InterfaceImplementation to override
	public static void main(String[] args) {
		InterfaceImplementation B = new InterfaceImplementation();
		B.addition();
		B.sub();
//TO access statick constant from iinterface
		System.out.println(InterfaceInJava.a);
	}
	
	

	@Override
	public void sub() {
	System.out.println("this is abstract method");
		
	}

	@Override
	public int addition() {
		int a= 10;
		int b=20;
		System.out.println(a+b);
		return a+b;
	}

}
