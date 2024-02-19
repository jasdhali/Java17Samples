package com.practice.classhierarchy;

import java.util.Arrays;

public class StringTrimVowels {

	public static void main(String[] args) {
		String payload = "aiiwqeqiwndnsccm###";
		System.out.println( new StringTrimVowels().trimVowels(payload));
	}

	public String trimVowels(String string) {
		char[] vowels = new char[] { 'a','i' };
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			int foundPos = Arrays.binarySearch(vowels, string.charAt(i));
			if (!(foundPos >= 0)) {
				builder.append(string.charAt(i));
			}
		}
		return builder.toString();
	}
}
