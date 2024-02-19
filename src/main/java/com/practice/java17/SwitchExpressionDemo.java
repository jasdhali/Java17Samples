package com.practice.java17;

public class SwitchExpressionDemo {

	public static void main(String[] args) {
		System.out.println("@@@@@@ Switch Expression Demo @@@@@@");

		Day day = Day.WEDNESDAY;
		System.out.println(switch (day) {
			case MONDAY -> 6;
			case TUESDAY -> 7;
			case WEDNESDAY -> 8;
			case THURSDAY -> 9;
			default -> throw new IllegalArgumentException("Unexpected value: ");
		});

		System.out.println(day.name());
		System.out.println(day.ordinal());
		System.out.println(day.values().toString());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
	}
}

enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY;
}
