package com.java.project.practices;

public class StringClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s= "wewcome to java";//string litral method
	System.out.println(	s.length());
	String word="welcome to class";
	String array1[]=word.split(" ");
	
	for(int i=0;i<array1.length;i++) {
		for (int j=array1[i].length()-1;j>=0;j--) {
			 char store1=array1[i].charAt(j);
			 System.out.print(store1);
		}

	
	}
		//System.out.println(s.charAt(3));//see character of string in that index position.
		//System.out.println(s.charAt(7));
		String s1="wefcdfvvbvbv bn n nn nn n nn";
		String g= "webdhdhdhdhd";
		//if 2 string are equals it return 0
		// if first string greater than second it return positive;
		//if second string is greater than first it return negative.
		System.out.println(g.compareTo(s1));
		
		//ignore method ignore case sensitivity while comparing
		System.out.println(s.compareToIgnoreCase("Welcome to java"));
		
		//concat use to add new string .
		System.out.println(s.concat(" in my class"));
		System.out.println("gggggggggggggggggggggggggg");
		// in s there is same something like in s1 to check this we use contains
		System.out.println(s.contains(s1));
		
		//to check whether string end with given value
		System.out.println(s.endsWith("java"));
		
		//to check same value
		System.out.println(s.equals("welcome to java"));
		System.out.println("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
		//
		String s2="welcome to java world to learning java methods";
		
		
		//indexOf(int ch)return a index no of charcter.
		int index1=s2.indexOf('e');
		System.out.println(index1);
		
		//indexOf(String substring,int fromIndex)The method takes substring 
		//and index as arguments and returns the index of the first character that 
		//occurs after the given fromIndex.
		int index2= s2.indexOf("java");
		int index3= s2.indexOf("java",12);
		int index4= s2.indexOf("java",38);//it return -1 if no result found
		System.out.println(index2+" "+index3+" "+index4);
		
		
		//lastIndexOf("ch/substring") it return a  last index of a given value.
		int index5= s2.lastIndexOf("to");
		System.out.println(index5);
		//String s2="welcome to java world to learning java methods";
		//lastIndexOf("substring",fromindex) it return next value index from which we given
		//and it checks from right to left but index goes from left to right.
		int index6= s2.lastIndexOf('a',26);
		System.out.println(index6);
		int index7= s2.lastIndexOf('a',11);
		System.out.println(index7);
		int index8=s2. lastIndexOf('l');
		System.out.println(index8);
	}

}
