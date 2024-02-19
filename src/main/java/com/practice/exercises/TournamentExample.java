package com.practice.exercises;

import java.util.ArrayList;
import java.util.List;

public class TournamentExample {
	private static int[] skills = new int[] { 3, 8, 2, 3 };
	private static int[] players = new int[] { 0, 1, 2, 3 };
	private static int[] newSkills;
	private static List<int[]> playerRoundCount = new ArrayList<>();

	public static void main(String[] args) {
		int[] is = result(skills);
		System.out.println();
		for (int i : is) {
			System.out.print(i);
		}

	}

	private static int[] res = new int[skills.length];
	static {
		int idx = 0;
		for (int i = 0; i < skills.length; i++) {
			res[idx++] = 1;
			playerRoundCount.add(new int[] { players[i], 1 });
		}
		playerRoundCount.forEach( ele-> System.out.print(ele[0] + "--"+ ele[1]+"|") );
	}
	static {

	}
	static int round = 1;

	private static int[] result(int[] playerSkills) {
		newSkills = new int[playerSkills.length/2];
		int remainSklIdx = 0;
		for (int ix = 0; ix < playerSkills.length; ix++) {
			round++;
			if ((ix + 1) % 2 == 0) {
				if (skills[ix - 1] > skills[ix]) {
					res[ix - 1] = res[ix - 1] + 1;
					newSkills[remainSklIdx++] = skills[ix - 1];
				} else {
					res[ix] = res[ix] + 1;
					newSkills[remainSklIdx++] = skills[ix];
				}
				;
			}			
		}
		for (int newSkill : newSkills) {
			System.out.print( newSkill );
		}
		return res;
	}
}
