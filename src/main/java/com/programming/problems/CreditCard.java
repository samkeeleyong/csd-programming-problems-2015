package com.programming.problems;

public class CreditCard {

	
	/*
	 * 
	 * Main logic
	 * 
	 * @param digits: int array
	 */
	public String process(int[] digits){
		if (isLuhnValid(digits))
			return "VALID";
		else {
			// Try all values for the last digit
			for (int i = 0; i < 10; i++) {
				digits[digits.length - 1] = i;
				if (isLuhnValid(digits)) {  // Guaranteed to execute before the loop ends
					return "INVALID " + digits[digits.length - 1];
				}
			}
		}
		
		// should never reach here
		throw new AssertionError();
	}
	
	/*
	 * Checks if the number is a valid credit card number
	 * 
	 * @param digits: int array
	 * @return {}: boolean 
	 */
	private static boolean isLuhnValid(int[] digits) {
		int sum = 0;
		for (int i = 0; i < digits.length; i++) {
			int d = digits[digits.length - 1 - i];
			if (i % 2 == 0)
				sum += d;
			else
				sum += d / 5 + d % 5 * 2;
		}
		return sum % 10 == 0;
	}
}
