
public class UseOfThis {

	public static void main(String[] args) {
		UseOfThis n = new UseOfThis();
		//UseOfThis b = new UseOfThis(1);

	}
//calling a parameterized constructor in a default constructor by using this .
	UseOfThis() {
		this(1);
		System.out.println("ggggggggggggg");
	
	}

	UseOfThis(int i) {
		
					System.out.println(i);
		}
	}

