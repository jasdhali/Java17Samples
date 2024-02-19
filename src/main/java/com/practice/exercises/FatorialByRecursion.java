package com.practice.exercises;

public class FatorialByRecursion {

	public static void main(String[] args) {
		System.out.println(factorial(4));
	}

	private static long factorial(int step) {
		if ((step - 1) == 0)
			return step * 1;
		else
			return step * factorial(step - 1);
	}

}
