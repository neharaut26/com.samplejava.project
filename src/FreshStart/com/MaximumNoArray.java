package FreshStart.com;

public class MaximumNoArray {

	public static void main(String[] args) {
		int a[]= {300,60,80,100,200};
	int max=	a[0];
	
	for(int i=1;i<a.length;i++) {
		if(a[i]>a[0]) {
			max=a[i];
		}
		
	}
	System.out.println(max);
	}

}
