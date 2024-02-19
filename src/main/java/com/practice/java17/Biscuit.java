package com.practice.java17;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Biscuit {
	private String taste;
	
	public void bake(int temp) throws BiscuitBurnedException {
		if(temp>150) {
			throw new BiscuitBurnedException("Its burned");
		}
	}
}

