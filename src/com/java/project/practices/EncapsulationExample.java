package com.java.project.practices;

public class EncapsulationExample {
//we can acheive a fully encapsulated class by using all the data members private.
		//we cant access private members in other class
	public static void main(String[] args) {
			Test t=new Test();
			t.setName("amit");//only write
			System.out.println(t.getName());//read
	
}
}

class Test{
	private String name="neha";
	private int a=10;
private float c;
//getter method
public String getName() {
	return name;
}

//setter methos for name 
public void setName(String name) {
	this.name=name;
}

}

