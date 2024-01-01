
public class ConstructorThis {

	public static void main(String[] args) {
		ConstructorThis b=new ConstructorThis();
		ConstructorThis c=new ConstructorThis(20);

	}


 public ConstructorThis (){
	 this(10);
	 System.out.println("hi");
	 
 }
 
 public ConstructorThis (int i) {
	 System.out.println(i);
 }
}