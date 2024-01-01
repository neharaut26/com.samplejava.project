
public class MethodThis {

	public static void main(String[] args) {
		MethodThis m = new MethodThis();
		m.m2();

	}
	void m1() {
		
		System.out.println("neha");
	}
	void m2() {
		//m1();//can also be write this compliler aUTOMATICALLY WIL TAKE THIS
	this.m1();
	}
	

}
