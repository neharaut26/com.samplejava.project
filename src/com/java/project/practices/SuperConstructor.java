package com.java.project.practices;

public class SuperConstructor {
	public static void main(String []args) {
		A B	=new A();
		
	}
	 public SuperConstructor(int a) {
		 System.out.println("hiiiiiiii");
		 System.out.println(this.hashCode());
	 }
}
	 class A extends SuperConstructor{
		 public A() {
			 super(10);//PARENT class constructor will invoke
			 System.out.println("super constructor of parent class is created");
			 System.out.println(super.hashCode());
			 System.out.println(this.hashCode());
		 }
		 
		 
	 }


