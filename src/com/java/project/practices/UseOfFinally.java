package com.java.project.practices;

public class UseOfFinally {

	public static void main(String[] args) {
		String s= null;
		try {
		s.length();
		}
		catch (ArithmeticException e) {
			System.out.println("sting cant be null,please enter proper value");
		}
		//that is a null pointer exception but suppose there may come arithmatic exception
		//then it cant be handle by catch block it will get terminate.to terminate
		//it safely we use finaaly block
		finally{
			System.out.println("Finally blocked");
			
		}
		System.out.println("further code program execusion will stop");
	}

}
