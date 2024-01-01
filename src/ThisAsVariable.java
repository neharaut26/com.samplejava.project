
public class ThisAsVariable {
	int a=10;
	float x =2.5f;

	public static void main(String[] args) {
		ThisAsVariable n =new ThisAsVariable();
		n.instance(20);
		n.instance2(4.5f);

	}
	//here instance and local variable are diffrent so no problem
	//but what if both the variable are same 
	//if both the variable are same then it will return 0 or null depend 
	//upon datatype//so to avoid this we use this keyword.
	public int instance(int i) {
		a=i;
		System.out.println(a);
		return a;
		
	}
	//here we r using this keyword see
	public float instance2(float x) {
		this.x = x;
		System.out.println(x);
		return x;
	}

}
