package com.java.project.practices;

import java.io.IOException;

public class ThrowKeyword {

	public static void main(String[] arg) throws ArithmeticException{
		try {
		int a= 10/0;
		}catch( ArithmeticException e) {
			System.out.println(e);
		}
		
	System.out.println("ghggh");
		
	}
	
}


