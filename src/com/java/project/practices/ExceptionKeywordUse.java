package com.java.project.practices;

public class ExceptionKeywordUse {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		String s= "12fdgf";
		try {
		Integer.parseInt(s);//suspicious code where exception comes
		}
	
	catch(NumberFormatException e){
		System.out.println("please enter valid string which contains onyl number");
	}
		//SAME CAN BE WRITTEN AS throwable it will also handle it
	
		/*
		 * catch(Throwable e){
		 * System.out.println("please enter valid string which contains onyl number"); }
		 */
		//try block will throw an object of exception and catch block will 
		//catch that object and handle it
	
	}

}
