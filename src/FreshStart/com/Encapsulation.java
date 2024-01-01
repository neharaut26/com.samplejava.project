package FreshStart.com;

public class Encapsulation {

	

	
private int a=10;
public void setValue(int a) {
this.a=a;
}
public int getValue()
{
	return a;
	
	}
}
class Abc{
	public static void main(String[] args) {
		Encapsulation v=new Encapsulation();
		v.setValue(20);
		System.out.println(v.getValue());

	

	}
}
