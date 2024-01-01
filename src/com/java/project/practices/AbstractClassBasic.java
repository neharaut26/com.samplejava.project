package com.java.project.practices;

public class AbstractClassBasic {

	public static void main(String[] args) {
	Test3 b=new Test3();
	b.test2();//calling abstract method
	b.test(10,15);
	}
}
	abstract class Testing{
		//it can have return type or not
		//fully implemented method
		public void test(int a,int b) {
			System.out.println(a+b);
		}
		//abstract method
		public abstract void test2();
	}
	//we cant create object of abstract class so we use here inheritance.
	
	class Test3 extends Testing{
//we cant access abstract method in non abstract class .so we ovrride it here
		@Override
		public void test2() {
			System.out.println("this is implementation of abstract class");
			
		}
		
		
	}
	


