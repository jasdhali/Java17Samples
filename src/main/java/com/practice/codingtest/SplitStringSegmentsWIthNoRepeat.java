package com.practice.codingtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SplitStringSegmentsWIthNoRepeat {
	private static String payload = "abceacp";
	public static void main(String[] args) {
		SplitStringSegmentsWIthNoRepeat workerClass=  new SplitStringSegmentsWIthNoRepeat();
		List<String> possibleSubstr = new ArrayList<>();
		//char[] arr = payload.toCharArray();
		for(int i=0;i<payload.length();i++) {
			for(int j=i;j<payload.length();j++) {
				possibleSubstr.add( payload.substring(i,j));
			}
		}
		
		System.out.println( possibleSubstr.toString() );
		List<String> noDups = 
				possibleSubstr.stream().filter( subArr -> !workerClass.dupFound(subArr)).collect(Collectors.toList());
		
		System.out.println( noDups.toString() );
	}
	
	public boolean dupFound(String strToTest) {
		for(int i=0;i<strToTest.length();i++) {
			char chrTst = strToTest.charAt(i);
			for(int j=i+1;j<strToTest.length();j++) {
				if( chrTst == strToTest.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}
	//public static test(String str) {
	//	for(int i=;str
	//}
}


