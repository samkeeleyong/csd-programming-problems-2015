package com.programming.problems;

import static org.junit.Assert.*;

import org.junit.*;

public class ZellersCongruenceTest {

	ZellersCongruence zellersCongruence;
	
	@Before
	public void setup(){
		zellersCongruence = new ZellersCongruence();
	}
	
	@Test
	public void testA(){
		String actual = zellersCongruence.getDayOfWeek(2005, 1, 21);
		String expected = "FRIDAY";
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void testB(){
		String actual = zellersCongruence.getDayOfWeek(2004, 12, 31);
		String expected = "FRIDAY";
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void testC(){
		String actual = zellersCongruence.getDayOfWeek(1963, 11, 22);
		String expected = "FRIDAY";
		
		assertEquals(actual, expected);
	}
}
