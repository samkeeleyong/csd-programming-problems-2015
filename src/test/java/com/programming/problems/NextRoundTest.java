package com.programming.problems;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NextRoundTest {

	NextRound nextRound;
	
	@Before
	public void setup(){
		nextRound = new NextRound();
	}
	
	// n = 8
	@Test
	public void testA() {
		int actual = nextRound.advanceToNextRountCount(5, new int[]{10,9,8,7,7,7,5,5});
		int expected = 6;
		
		assertEquals(actual, expected);
	}

	// n = 4
	@Test
	public void testB() {
		int actual = nextRound.advanceToNextRountCount(2, new int[]{0,0,0,0});
		int expected = 0;
		
		assertEquals(actual, expected);
	}
	
	// n = 17
	@Test
	public void testC() {
		int actual = nextRound.advanceToNextRountCount(14, new int[]{16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0});
		int expected = 14;
		
		assertEquals(actual, expected);
	}

	// n = 49
	@Test
	public void testD() {
		int actual = nextRound.advanceToNextRountCount(8, new int[]{99,98,98,96,92,92,90,89,89,86,86,85,83,80,79,76,74,69,67,67,58,56,55,51,49,47,47,46,45,41,41,40,39,34,34,33,25,23,18,15,13,13,11,9,5,4,3,3,1});
		int expected = 9;
		
		assertEquals(actual, expected);
	}
	
	// n = 10
	@Test
	public void testE() {
		int actual = nextRound.advanceToNextRountCount(10, new int[]{5,5,5,3,3,3,0,0,0,0});
		int expected = 6;
		
		assertEquals(actual, expected);
	}
}
