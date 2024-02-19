package com.practice.basic;

public class OuterEx1WithMemberInner {
	private String greeting = "hi";

	protected class Inner {
		public int repeat = 3;

		public void go() {
			for (int i = 0; i < repeat; i++) {
				System.out.println(greeting);
			}
		}
	}

	public void callInner() {
		Inner inner = new Inner();
		inner.go();
	}

	public static void main(String[] args) {
		OuterEx1WithMemberInner outer = new OuterEx1WithMemberInner();
		outer.callInner();
	}
}