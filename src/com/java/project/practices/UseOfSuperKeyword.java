package com.java.project.practices;
//here parent class of this class is object
public class UseOfSuperKeyword {
	String color = "red";
		
//super vkeyword is use to refer parent class intance variable but if both
	//child and parent class have same fields.
public static void main(String []args) {
	animal a =new animal();
	a.display();
}
}
class animal extends UseOfSuperKeyword{
	String color="black";
	

public void display() {
	System.out.println(color);//will refer current class
	System.out.println(super.color);//will refer parent clss.
}
}