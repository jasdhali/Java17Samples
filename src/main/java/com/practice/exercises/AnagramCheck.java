package com.practice.exercises;

import java.util.Arrays;

/**
 * Anagram is a set of words which are having same set of characters.
 * Like 'mother in law' and 'hitler woman"
 */
public class AnagramCheck {

	public static void main(String[] args) {
		System.out.println( checkAnagram("mother in law", "hitler woman") );
	}
	
	public static boolean checkAnagram(String str1,String str2) {
		String str1T = str1.replaceAll("\\s","");
		String str2T = str1.replaceAll("\\s","");
		
		char[] charArr1 =  str1T.toCharArray();
		char[] charArr2 =  str2T.toCharArray();		
		
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		return  charArr1.equals(charArr2);
	}
}
