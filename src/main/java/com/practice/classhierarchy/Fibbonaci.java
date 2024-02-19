package com.practice.classhierarchy;

public class Fibbonaci {

	public static void main(String[] args) {
		int[] start = new int[] { 0, 1 };

		int range = 5;
		int next = 0;

		print(start[0]);
		print(start[1]);

		for (int i = 2; i <= range; i++) {

			next = start[0] + start[1];

			print(next);
			// next =
			start[0] = start[1];
			start[1] = next; 

		}

	}

	public static void print(int num) {
		System.out.println(num);
	}
}
