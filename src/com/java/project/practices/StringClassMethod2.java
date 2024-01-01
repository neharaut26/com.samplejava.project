package com.java.project.practices;
import java.util.Arrays;  

public class StringClassMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s2= "welcome to java for learning java skills ";
		//it return true if string length is empty.
		boolean index1= s2.isEmpty();
		System.out.println(index1);
		//it returns lenght of string
		System.out.println(s2.length());
		//string join()is use to join 
		
		String date=String.join("/", "26","12","1992");
		
		String time =String.join(":", "2","30","40");
		
		System.out.print(date);
		System.out.println(" "+time);
		//replace("old char" "new char")it replace old chracter through out.
		System.out.println(s2.replace('e', 's'));
		
		//
		System.out.print(s2.replaceAll("a", "time"));
		System.out.println(s2.replaceAll(" ", "s"));
		
		//split() is use to make 2 diffrnt part of a stringit will reject on 
		//which string we take this function
		
		String array[]=s2.split("for");
		//System.out.println(Arrays.toString(array));
		String array1[]=s2.split(" ");
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"); 
		
		String r= "1234j4534ABCddffg#$%&23";
		System.out.println(r.replaceAll("[0-9]",""));
		System.out.println(r.replaceAll("[^0-9a-z]",""));//caret ^ 
		System.out.println(r.replaceAll("[^0-9A-Za-z]",""));
		System.out.println(r.replaceAll("[0-9a-zA-Z]",""));
	System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmm");
		//substring it gives the substring of given index no and it ignore spaces
		String s3= "welcome to java to learn java skills ";
		System.out.println(s3.substring(20));
		System.out.println(s3.substring(11,15));
		// trim()it trim spaces which comes before and after the string 
		System.out.println("      hi i am neha        ".trim());
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		
	}
}
