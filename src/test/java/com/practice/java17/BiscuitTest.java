package com.practice.java17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BiscuitTest {

	@Test
	public void testEquals() {
		Biscuit theBiscuit = new Biscuit("Ginger");
		Biscuit myBiscuit = new Biscuit("Ginger");
		// assertThat( true , theBiscuit.equals(myBiscuit));
	}

	@Test
	public void testOverHeatBurnsBiscuit() {
		Biscuit biscuit = new Biscuit();
		BiscuitBurnedException thrown = Assertions.assertThrows(BiscuitBurnedException.class, () -> {
			// Code under test
			biscuit.bake(151);
		});
		
		Assertions.assertTrue("Its burned".equals(thrown.getMessage()));
	}

}
