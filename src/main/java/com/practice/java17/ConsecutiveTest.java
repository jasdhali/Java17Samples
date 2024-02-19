package com.practice.java17;

public class ConsecutiveTest {

	public static void main(String[] args) {
		consecutive(new int[] {1,2,5,6,9});
	}

	public static void consecutive(int[] arr) {
		int min = Integer.MAX_VALUE, max = -1;
		for (int i = 0; i < arr.length; i++) {
			//if (arr[i] < min) {
				min = Math.min(min, arr[i]); 
			//}
			//if (arr[i] > max) {				 
				 max = Math.max(min, arr[i]);
			//}
		}
		int diff = (max-min) + 1;
		System.out.println( diff - arr.length );		
	}
}