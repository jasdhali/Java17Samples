package com.practice.basic;

public class ClassWithLocalInnerClass {
	private int width = 20;

	public void calculate() {
		final int length = 10;

		class Inner {
			public void getArea() {
				System.out.println("The area is : " + length * width);
			}
		}
	}

	public static void main(String[] args) {
		ClassWithLocalInnerClass innerClass = 
				new ClassWithLocalInnerClass();
		
	}
}
