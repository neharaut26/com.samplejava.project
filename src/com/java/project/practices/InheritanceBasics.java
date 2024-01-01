package com.java.project.practices;

public class InheritanceBasics {

	public static void main(String[] args) {
		//this is single level inheritance
		// we need to create object of child class to acess parent behaviours.
	//	Parent first=new Child();//we can also take parent datatype
		Child first = new Child();
		System.out.println(first.a);
		first.parentClassAddition();
		first.childSub();
		System.out.println(Child.c);
	}
}

class Parent {
	int a = 20;
	int b = 30;
	static int c=29;

	public void parentClassAddition() {
		System.out.println(a + b);
	}
}

//extends keyword is use to acqire all properties and behaviour of parent class also 
//to increse the functionality.
class Child extends Parent {
	public void childSub(){
	System.out.println(a-b);
	}
}
