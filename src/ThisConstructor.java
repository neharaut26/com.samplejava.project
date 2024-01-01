
public class ThisConstructor {

	public static void main(String[] args) {
		
		ThisConstructor h = new ThisConstructor(10);
		//ThisConstructor b = new ThisConstructor();

	}
	public ThisConstructor(){
	for(int i=1;i<=20;i++) {
		if(i%2==0) 
			continue;
		else {
			System.out.println("the odd no are="+i);
		}
	}
	}
	//calling a default constructor from parameterized constructor.
	public ThisConstructor(int x){
		this();//this should be always a first statment.
		System.out.println(x);
	}

}
