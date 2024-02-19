package com.practice.exercises;

public class IlandAndWater {
	private static String[][] data = new String[][] { 
			new String[] { "1", "1", "1", "1", "0" },
			new String[] { "1", "1", "0", "1", "0" }, 
			new String[] { "1", "1", "0", "0", "0" },
			new String[] { "0", "0", "0", "0", "0" } };

	public static void main(String[] args) {
		traverse(data);
		System.out.println( istopLandConnected(2,3) );
	}
	private static void traverse(String[][] data) {
		for(String[] row:data) {
			for(String cell:row) {
			  System.out.print(cell+" ");
			}
			System.out.println();
		}
	}
	private static boolean isLand(String value) {
		return (value.equals("1"));
	}

	private static boolean istopLandConnected(int xPos, int yPos) {
		for(int i=0;i<yPos;i++) {
			String cell = data[i][xPos];
			if( !isLand(data[i][xPos])) {
				return false;
			}
		}
		return true;
	}
	private static boolean isBottomLandConnected(int xPos, int yPos) {
		for(int i=data.length;i<yPos;i--) {
			String cell = data[i][xPos];
			if( !isLand(data[i][xPos])) {
				return false;
			}
		}
		return true;
	}
}
