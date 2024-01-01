package com.java.project.practices;

public class MultilevelInheritanse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandChild H = new GrandChild();
		H.pMul();
		 H.cEvenNo();
		H.PrimeNo();

	}
}

class First {
	int a = 30;
	int b = 20;

	public void pMul() {
		System.out.println(a * b);
	}
}

// child class
class Second extends First {
	public void cEvenNo() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("even no is" + i);
			}
		}
	}
}
// grandchild

class GrandChild extends Second {
	public void PrimeNo() {
int k;
		for (int j = 1; j <= 29; j++) {
			for ( k = 2; k <= 29; k++) {
				if (j % k == 0) {
					break;
				}
			}
			if (j == k) {
				System.out.println(j);
			}

		}
	}
}
