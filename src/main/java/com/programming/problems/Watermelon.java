package com.programming.problems;

public class Watermelon {

	
	/*
	 * Odd numbers can't be divided into two 
	 * such that the result are equal and even 
	 * so number must be even
	 * 
	 * two cannot be divided equally
	 * 
	 * must look out for even numbers that divide
	 * into two odd numbers
	 * 
	 * @param w:int
	 * @return {}:string  
	 */
	public String isDivideEqualEven(int w){
		return (w/2) % 2 == 0 ? "YES": "NO";
//		return w%2==0 && w!=2?"YES":"NO";
	}
}
