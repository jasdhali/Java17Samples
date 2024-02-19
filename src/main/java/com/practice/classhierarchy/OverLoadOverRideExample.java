package com.practice.classhierarchy;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverLoadOverRideExample {
	public static void main(String[] args) {
		Truck truck = new Truck();
		truck.setColor("Blue");

		PassengerVehicle passengerVehicle = new PassengerVehicle();
		passengerVehicle.setDimensions(10, 5);
		try {
			passengerVehicle.getSpeed(1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

class Vehicle {
	private String color;

	public void setColor(String color) {
		this.color = color;
	}

	private int length;
	private int height;

	public void setDimensions(int length, int height) {
		this.height = height;
		this.length = height;
	}

	protected int getSpeed(int season) throws IOException {
		System.out.println("0..");
		return 10;
	}
}

class PassengerVehicle extends Vehicle {
	public void setDimensions(int height, int length) {
		System.out.println("0");
		super.setDimensions(length, height);
	}

	public void setDimensions(Integer height, int length) {
		System.out.println("1");
		super.setDimensions(length, height);
	}

	protected int getSpeed(int season) throws FileNotFoundException {
		System.out.println("1..");
		return 10;
	}
}

class TransportVehicle extends Vehicle {

}

class Car extends PassengerVehicle {

}

class Truck extends TransportVehicle {

}
