package com.programming.problems;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CreditCardTest {

	CreditCard creditCard;
	@Before
	public void setup(){
		creditCard = new CreditCard();
	}
	
	@Test
	public void testA() {
		String actual = creditCard.process(new int[]{4,9,9,2,7,3,9,8,7,1,6});
		String expected = "VALID";
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void testB() {
		String actual = creditCard.process(new int[]{5,1,3,4,6,7,8,8,2,1,3,4});
		String expected = "INVALID 2";
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void testC() {
		String actual = creditCard.process(new int[]{4,3,2,8,7,6,1,2,6});
		String expected = "VALID";
		
		assertEquals(actual, expected);
	}

}
