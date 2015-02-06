package com.programming.problems;

public class VasyaAndSocks {
	
	/*
	 * 
	 * @param numberOfSocks: int
	 * @param addSockFactor: int
	 * @return day: int
	 * 
	 */
	public int daysUntilOutOfSocks(int numberOfSocks, int addSockFactor){
		int day = 1;
		
		for(; numberOfSocks > 0; day++){
			//mom adds a pair
			if(day%addSockFactor == 0){
				numberOfSocks++;
			}
			numberOfSocks--;
		}
		
		return --day;
	}
}
