package FreshStart.com;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse each word .
		String word="hellow how are you";
	String array[]=	word.split(" ");
	
	for(int i=0;i<array.length;i++) {
		for(int j=array[i].length()-1;j>=0;j--) {
		char reverseValue=	array[i].charAt(j);
		System.out.print(reverseValue);
		}
		System.out.print(" ");
	}
	System.out.println("############");
	
	//reverse whole 
	String words="i m neha";
	for(int k=words.length()-1;k>=0;k--){
		System.out.print(words.charAt(k));
	}
	
	String d= "i am krithya";
	
for(int i=d.length()-1;i>=0;i--) {
char reverse=	d.charAt(i);
System.out.print(reverse);
}

	}

}
