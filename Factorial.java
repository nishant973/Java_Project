package com.learn.programs;

public class Factorial {

	public static void main(String[] args) {
		int input = 8;
		normalFact(input);
		int result = factByRecursion(input);
		System.out.println("factorial of given number is : " + result);
	}

	private static int factByRecursion(int input) {
		if(input == 0) {
			return 1;
		}
		return input * factByRecursion(input-1);
		// 1 * fact(4)
		// 1 * fact(3)
		// 1 * fact(2)
		// 1 * fact(1)
	}

	private static void normalFact(int input) {
		int fact = input;
		for(int j=1;j<input;j++) {
			fact = j*fact;//f = f,
		}
		System.out.println("factorial of given number is : " + fact);
	}

}
