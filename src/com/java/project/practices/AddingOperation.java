package com.java.project.practices;

public class AddingOperation {
	String name;
	int RollNo;
	static String compnyName="abc";
	
	AddingOperation(String name,int RollNo){
		this.name=name;
		this.RollNo=RollNo;
	
	}
	public void display() {
		System.out.println("details of employee are ="+name+" "+RollNo+" "+AddingOperation.compnyName);	
	}

	public static void main(String[] args) {
		AddingOperation details1=new AddingOperation("neha",1);
		details1.display();
		
		AddingOperation details2=new AddingOperation("amit",2);
		details2.display();
		AddingOperation details3=new AddingOperation("nh",3);
		details3.display();
	}

}
