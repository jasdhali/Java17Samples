package com.practice.basic;

public class MyMusic {
	private String name;
	public static void main(String[] args) {
		
		MyMusic m1 = new MyMusic();
		MyMusic m2 = new MyMusic();
		m1.name = m2.name = "m1";		
	}
	
	private static void callMe(MyMusic[] m) {
		
	}

}
