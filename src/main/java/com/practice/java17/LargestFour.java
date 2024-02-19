package com.practice.java17;

import java.util.Arrays;

public class LargestFour {

	public static void main(String[] args) {
		System.out.println(LargestFour.getTop4Sum(new int[] {2,4,9,1,9,2,3}));
	}

	public static int getTop4Sum(int[] arr) {
		int sum=0;
		Arrays.sort(arr);
		//System.out.println(arr.toString());
		for( int j=0;j<arr.length;j++) {
			//System.out.println( arr[j] );
		}
		int i=1;
		
		for( int j=arr.length-1;j>=0;j--) {
			//System.out.println( arr[j] );
			if(i<=4) {
				sum += arr[j];
			}			
			i++;		
		}
		return sum;
	}
}
