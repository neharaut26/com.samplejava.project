package FreshStart.com;

public class MinimumNumberArray {

	public static void main(String[] args) {
		int a[]= {56,89,78,20,60};
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<a[0]) {
				min=a[i];
			}
		}
System.out.println(min);
	}

}
