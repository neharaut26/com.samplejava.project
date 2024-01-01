package com.java.project.practices;

public class StringBufferClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//here StringBuffer is a class and this is a declaraition
		StringBuffer buffer = new StringBuffer("hello");
		buffer.append(" neha");//append is use to modify or add something in existing.
		System.out.println(buffer);
		
		StringBuilder builder = new StringBuilder("hey");
	 System.out.print(builder.append(" are u a neha?"));
		
	}

}
