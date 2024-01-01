package FreshStart.com;

public class DuplicateNoArray {

	public static void main(String[] args) {
		int a[]= {20,7,50,60,30};
		int duplicate=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					duplicate=a[j];
				}
			}
		}
		System.out.println(duplicate);
		
}
}