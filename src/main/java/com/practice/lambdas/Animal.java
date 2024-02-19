package com.practice.lambdas;

import java.util.function.Predicate;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Animal {
	private String species;
	private boolean canHop;
	private boolean canSwim;

	public String getSpecies() {
		return species;
	}

	public boolean isCanHop() {
		return canHop;
	}

	public boolean isCanSwim() {
		return canSwim;
	}

}


