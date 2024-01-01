package com.java.project.practices;

public class MethodOverRiding {

	public static void main(String[] args) {
	//	here due to child object child class method will call
		//Parent4 v = new Child4();
		//System.out.println(v.mul());
		Child4 k	=new Child4();
	System.out.println(k.mul());
		
	}
}
	class Parent4{
		int a =10;
		public int mul() {
		return a * 10;
		}
		
	}
	
	class Child4 extends Parent4{
		public int mul() {
			return a * 12;
	}
	}


