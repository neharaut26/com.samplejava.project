package p1;

import p2.S2;

public class M2 {
	public static void main(String[] args) {
		Protect protect = new Protect();
		 protect.abe();;//see we cant access protected variable so
		//we need to make a child class to acees it
		
		

}
	public void k() {
		System.out.println(" fully qualified name ");
	}
}

//
	class Protect extends S2{
		public void abe() {
		//i=20;
		System.out.println(i);
			
		}
	}
