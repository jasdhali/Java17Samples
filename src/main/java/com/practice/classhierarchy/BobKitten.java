package com.practice.classhierarchy;


public class BobKitten extends BobCat {
	

	public BobKitten() {
		super();
		System.out.println("subclass-CONSTRUCTOR");
	}

	public Integer findDen() {
		System.out.println("subclass");
		return 10;
	}
	
	public void another() {
		System.out.println("####another()####");
	}
	
	public static void main(String[] args) {
		BobCat  bobCat1 = new BobKitten();
		//bobCat1.findDen();
		
		System.out.println("####1111111111####");
		
		BobKitten  bobCat2 = new BobKitten();
		//BobCat  bobCat4 = (BobCat)bobCat2; 
		//bobCat2.findDen();
		
		System.out.println("####2222222222####");
		BobCat  bobCat3 = new BobCat();
		//bobCat3.findDen();
		
		
	}
}
