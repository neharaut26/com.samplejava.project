package com.java.project.practices;

public class DecisionMakingProgram {

	public static void main(String[] args) {
		int age = 20;
		String country = "india";
		if (age >= 15 && country.equals("india")) {
			System.out.println("congratulations u r eligible for voting");
		}

		// System.out.print("SORRY u r NOT eligible for voting");
		System.out.println("##################################################");

		// if else-if

		int marks = 70;
		if (marks >= 35 && marks <= 50) {
			System.out.println("u r pass");
		} else if (marks >= 35 && marks >= 60) {
			System.out.println("u r pass with first class");
		} else if (marks >= 35 && marks <= 75) {
			System.out.println("u r pass with dinstinction");
		} else {
			System.out.println("u r fail");
		}

//nested if
		int age1 = 18;
		float weight = 47.5f;
		if (age1 > 17) {
			if (weight >= 48) {
				System.out.println("congratulation u can donate ur blood");
			}
		} else {
			System.out.println("congratulation u cant donate ur blood");
		}

	}

}
