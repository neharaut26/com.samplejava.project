
package p2;
 import p1.*;

//import p1.M1;TO AVOID MULTITIMES WRITTING OF IMPORT WE USE *
//import p1.S1;

public class S2 {
	//use of protected keyword
	protected int i=10;//we have to access it in package p1.

	public static void main(String[] args) {
		S1 b= new S1();
		b.shan();
		M1 N =new M1();
		N.amit();
		p1.M2 j=new p1.M2();//fully qualified name
		j.k();
		
	}
	public void  neha(){
		System.out.println("this is package p2"); 
	}

}
