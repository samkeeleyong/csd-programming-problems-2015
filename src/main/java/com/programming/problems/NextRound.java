package com.programming.problems;

public class NextRound {
	
	/*
	 * DESC HERE
	 * 
	 * @param kthPlaceScore: int
	 * @param contestants: int array
	 */
	public int advanceToNextRountCount(int kthPlaceScore, int[] contestants){

		int sentinel = 0;

		int toCompareScore = contestants[kthPlaceScore - 1];
		
		for(Integer i: contestants){
			if(i >= toCompareScore && i > 0)
				sentinel++;
		}
		
		return sentinel;
	}
}
