
public class Student {
	String name,cast;
	int rollno;
	float height;

	public static void main(String[] args) {
		Student student1 =new Student(1,"neha","kunbi");
		Student student2 =new Student(2,"pradnya","kunbi",5.3f);
		Student student3 =new Student(3,"amt","kunbi");
		Student student4 =new Student(2,"dipa","kunbi",5.4f);
		student1.display();
		student2.display();
		student3.display();
		student4.display();
	}
	Student(int rollno,String name,String cast){
		this.rollno=rollno;
		this.name= name;
		this.cast=cast;
	}
	Student(int rollno,String name,String cast,float height){
		this(rollno,name,cast);
		this.height=height;

	}
	void display() {
		System.out.println("the student record="+rollno+" "+name+" "+cast+" "+height);
	}
}
