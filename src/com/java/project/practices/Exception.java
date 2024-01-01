package com.java.project.practices;
import java.io.File;//// it contains all the input and the output streams  
import java.io.FileInputStream;
public class Exception {

	public static void main(String[] args) {
	//compiletine error /unchecked error
		File file = new File("C:\\Users\\ABC\\Desktop\\krithya\\manual interview qn.txt	");
		//FileInputStream Fileinput=new FileInputStream(file);
		//above is the file not found exception.
	//	URL url= new URL("http:\\www.google.com");
		//above is the  exception.
		
		String S="NEHA";
		for(int i=0;i<S.length();i++) {
			System.out.print(S.charAt(i));
			//THIS IS RUNTIME EXCEPTION
			//stringIndexOutOFboundsException
			
			//String s2= null;
			//s2.length();
			//this is null pointer Exception
			
		//	int a= 10/0;
			//System.out.println(a);
			//this is arithmatic exception
			
			//String ss= "123bvd";
			//below is the wrapper class who convert string into integer
			// but need to contain only numbers
			//int b=Integer.parseInt(ss);
			//System.out.println(b);
			//this is no format exception
			
			int array[]=new int[8];
			array[9]=10;
			System.out.println(array[9]);
			
		}
		
	}

}
