package FreshStart.com;

public class AscendingAndDescendingOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = { 10, 30, 31, 40,  37, 56 };
		int k = 0;
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[i] > array1[j]) {
					k = array1[i];
					array1[i] = array1[j];
					array1[j] = k;
				}
			}
		}
		
		System.out.print("the ascending numbers are=" );
		
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+" ");
		}
		System.out.println(" ");
		
		//descending numbers
		System.out.println("Descending numbers are=");
		for(int i=array1.length-1;i>=0;i--) {
			System.out.print(array1[i]+" ");
		}
	}
}
