package com.java.project.practices;

public class MethodOverloadingProgram {
//perform same task in diffrent ways
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//either we can call by class method 
		MethodOverloadingProgram save =new MethodOverloadingProgram ();	
		save.addition(10.5f,20,10.5f);
		
		//or by using child class we can call it
		//Child3 n = new Child3();
		//n.addition(10.5f,20,10.5f);
		
	}
	public void addition(int a,int b) {
		System.out.println(a+b);
	}
	public void addition(int a,float c ) {
		System.out.println(a+c);
	}
	public void addition(float a,int b,float c) {
		System.out.println(a+b+c);
	}
	
	
	

}

 class Child3 extends MethodOverloadingProgram{ 
	 public void addition(int a,float c) {
		 System.out.println(a+c);
		 } 
	 }
 
