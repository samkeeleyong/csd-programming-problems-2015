package com.programming.problems;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WatermelonTest {

	Watermelon watermelon;
	
	@Before
	public void setup(){
		watermelon = new Watermelon();
	}
	
	@Test
	public void testA() {
		String actual = watermelon.isDivideEqualEven(2);
		assertEquals(actual, "NO");
	}
	
	@Test
	public void testB(){
		String actual = watermelon.isDivideEqualEven(15);
		assertEquals(actual, "NO");		
	}
	
	@Ignore
	@Test
	public void testC(){
		String actual = watermelon.isDivideEqualEven(30);
		assertEquals(actual, "NO");		
	}
	
	@Test
	public void testD(){
		String actual = watermelon.isDivideEqualEven(88);
		assertEquals(actual, "YES");		
	}
	
}
