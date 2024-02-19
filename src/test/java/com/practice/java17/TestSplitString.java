package com.practice.java17;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.practice.codingtest.SplitStringSegmentsWIthNoRepeat;

public class TestSplitString {
	
	
	@Test
	public void testdupCound_success(){
		SplitStringSegmentsWIthNoRepeat classToTest = new SplitStringSegmentsWIthNoRepeat();
		assertFalse( classToTest.dupFound("abc") );
		assertTrue( classToTest.dupFound("abcc") );
		assertFalse( classToTest.dupFound("") );
	}
	
	@Test
	public void testdupFoundSingleLetter_success(){
		SplitStringSegmentsWIthNoRepeat classToTest = new SplitStringSegmentsWIthNoRepeat();
		assertFalse( classToTest.dupFound("a") );
	}	
}
