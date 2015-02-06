package com.programming.problems;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VasyaAndSocksTest {

	VasyaAndSocks vs;
	
	@Before
	public void setup(){
		vs = new VasyaAndSocks();
	}
	
	@Test
	public void testA() {
		int actual = vs.daysUntilOutOfSocks(2, 2);
		int expected = 3;
		assertEquals(actual, expected);
	}
	
	@Test
	public void testB() {
		int actual = vs.daysUntilOutOfSocks(9, 3);
		int expected = 13;
		assertEquals(actual, expected);
	}

	@Test
	public void testC() {
		int actual = vs.daysUntilOutOfSocks(4, 4);
		int expected = 5;
		assertEquals(actual, expected);
	}

	@Test
	public void testD() {
		int actual = vs.daysUntilOutOfSocks(10, 2);
		int expected = 19;
		assertEquals(actual, expected);
	}

	@Test
	public void testE() {
		int actual = vs.daysUntilOutOfSocks(99, 100);
		int expected = 99;
		assertEquals(actual, expected);
	}

	@Test
	public void testF() {
		int actual = vs.daysUntilOutOfSocks(2, 2);
		int expected = 3;
		assertEquals(actual, expected);
	}

	@Test
	public void testG() {
		int actual = vs.daysUntilOutOfSocks(100, 5);
		int expected = 124;
		assertEquals(actual, expected);
	}

	@Test
	public void testH() {
		int actual = vs.daysUntilOutOfSocks(52, 96);
		int expected = 52;
		assertEquals(actual, expected);
	}


}
