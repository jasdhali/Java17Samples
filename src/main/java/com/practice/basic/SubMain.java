package com.practice.basic;

public class SubMain extends OuterMain {
	public int y = 11;

	public void any() {
		System.out.println( this.y);
	}

	public static void main(String[] args) {
		SubMain main = new SubMain();
		main.any();
	}
}