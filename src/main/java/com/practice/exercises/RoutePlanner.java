package com.practice.exercises;

public class RoutePlanner {

	public static boolean routeExists(int fromRow, int fromColumn, int toRow, int toColumn, boolean[][] mapMatrix) {
		boolean routeExists = false;
		for (int i = 0; i < mapMatrix.length; i++) {
			for (int j = 0; j < mapMatrix[i].length; j++) {
				System.out.print("-" + mapMatrix[i][j]);
				boolean vTrue = false;
				boolean hTrue = false;

				if (j < mapMatrix[i].length - 1)
					hTrue = (mapMatrix[i][j] && mapMatrix[i][j + 1]);

				if (i < mapMatrix.length - 1)
					vTrue = (mapMatrix[i][j] && mapMatrix[i + 1][j]);

				System.out.println(i + "--" + "(" + hTrue + ")--(" + vTrue + ").");

			}
			System.out.println();
		}
		// throw new UnsupportedOperationException("Waiting to be implemented.");
		return routeExists;
	}

	public static boolean checkBelow(int indexX, int indexY, boolean[][] mapMatrix, POSITION position) {
		boolean foundPath = false;
		if (position == POSITION.BELOW) {
			foundPath = mapMatrix[indexX + 1][indexY];
		}
		else if (position == POSITION.RIGHT) {
			foundPath = mapMatrix[indexX ][indexY+1];
		}
		else if (position == POSITION.BELOW) {
			foundPath = mapMatrix[indexX + 1][indexY];
		}
		else if (position == POSITION.BELOW) {
			foundPath = mapMatrix[indexX + 1][indexY];
		}
		return foundPath;
	}

	

	public static void main(String[] args) {
		boolean[][] mapMatrix = { 
				{ true, false, false }, 
				{ true, true, false }, 
				{ false, true, true } 
				};

		// routeExists(0, 0, 2, 2, mapMatrix);
		System.out.println(checkBelow(0, 0, mapMatrix,POSITION.BELOW));
		System.out.println(checkBelow(0, 0, mapMatrix,POSITION.BELOW));
	}

	public enum POSITION {
		BELOW, ABOVE, LEFT, RIGHT;
	}
}