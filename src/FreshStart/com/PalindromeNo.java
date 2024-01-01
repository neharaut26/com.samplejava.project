package FreshStart.com;

public class PalindromeNo {

	public static void main(String[] args) {
		int no=525;
		int temp=no;
		int rev=0,rem;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev) {
			System.out.println(no+"it is a palindrome no");
		}else {
			
			System.out.println(no+"it is not a palindrome no");
		}
		
		
		

	}

}
