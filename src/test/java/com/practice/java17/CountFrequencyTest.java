package com.practice.java17;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;

import org.junit.jupiter.api.Test;

import com.practice.exercises.CountFrequency;

public class CountFrequencyTest {
	
	@Test
	public void testGetUniqueElementsSuccess() {
		CountFrequency countFrequency = new CountFrequency();
		int[] arr = new int[] {1,2,4,5,2,4,7,9,9};
	 	Set<Integer> uniqueSet =  countFrequency.getUnique(arr);
	 	System.out.println( uniqueSet );
	 	assertEquals(uniqueSet.size(), 6);
	}
}
