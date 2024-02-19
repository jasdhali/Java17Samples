package com.practice.java17;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateUsingHashMap {
	private final static char[] dataArray = { 'c', 'f', 'd', 'a', 'd', 'c', 'f', 'd', 'a', 'd' };
	
	public static void main(String[] args) {
		Map<Character,Integer> mapOutput = new HashMap<>();
		
		for(char chr : dataArray) {
			Object objChr = mapOutput.get(chr);
			if(objChr == null ) {
				mapOutput.put(chr,1);
			} else {
				int currCount = (int)objChr;				
				mapOutput.put(chr,++currCount);
			}
		}
		mapOutput.forEach( (k,v )-> System.out.println("Char => " + k + "--Occurrence -> " + v));
		
	}
}
