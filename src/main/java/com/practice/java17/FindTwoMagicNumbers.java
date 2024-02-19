package com.practice.java17;

import java.util.ArrayList;
import java.util.List;

public class FindTwoMagicNumbers {

	public static void main(String[] args) {
		int[] payLoad = new int[] {7,2,3,4,7,0,9,-2,4,2,4,5,6,8,3,4};
		List<int[]> l = new ArrayList<>();
		for(int i = 0; i < payLoad.length;i++) {
			if(i>0 && i<payLoad.length-1) {
				if( (payLoad[i]+payLoad[i+1]) == payLoad[0]) {
					l.add(new int[] {payLoad[i],payLoad[i+1]});
				}
			}			
		}
		//System.err.println(l.toString());
		l.stream().forEach( e -> System.out.println(e[0]+","+e[1])	);
	}
	
}

@FunctionalInterface
interface FindNum {
	<T> T getNum(int num1,int num2); 
}
