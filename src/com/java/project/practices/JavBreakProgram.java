package com.java.project.practices;

public class JavBreakProgram {

	public static void main(String[] args) {

		// print 1-100 numbers by using break

		int a = 1;

		for (;;) {
			if (a > 100) {
				break;
			}

			System.out.print(a + "\t");
			a++;

		}

		// print 1 to 100 but skip values between 51-60

		int i = 1;
		for (i = 1; i <= 100; i++) {

			if (i > 50 && i < 61) {
				continue;
			}
			System.out.print(i + " ");
		}

		// print odd numbers from 1-20

		int b = 1;

		for (b = 1; b <= 20; b++) {
			if (b % 2 != 0) {
				System.out.println(b + "\t");
			} else {
				continue;
			}
		}
		
		System.out.println("#####################################################");
		//print reverce order number from 20-10
		for(int j=20;j>=10;j--) {
			System.out.println(j+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("********************************");

		// print prime number between 1-100
		int c;
		int d;
		for (c = 1; c <= 100; c++) {
			for (d = 2; d < c; d++) {
				if (c % d == 0)
					break;
			}
			if (c == d|| c==1) {
				System.out.println(c);
			}
		}

	}
}
