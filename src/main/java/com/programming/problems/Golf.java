package com.programming.problems;

import java.util.List;
import java.util.Arrays;


//TO DO
public class Golf {

	/*
	 * 
	 * @return {}: String List
	 */
//	public List<String> rankGolfers(Golf[] golfers){
//		Golfer[] golfers = new Golfer[n];
//		for (int i = 0; i < n; i++) {
//			String name = io.readLine();
//			int score = 0;
//			for (int j = 0; j < 9; j++)
//				score += io.readIntLine();
//			golfers[i] = new Golfer(name, score);
//		}
//		
//		// Sort ascending and write the output
//		Arrays.sort(golfers);
//		for (int i = 0; i < 5; i++) {
//			Golfer golfer = golfers[i];
//			io.printf("%s %d%n", golfer.name, golfer.score);
//		}
//	}
	
	
	private static class Golfer implements Comparable<Golfer> {
		public final String name;
		public final int score;
		
		public Golfer(String name, int score) {
			this.name = name;
			this.score = score;
		}
		
		public int compareTo(Golfer g) {
			if (score != g.score)
				return Integer.compare(score, g.score);
			else
				return name.compareTo(g.name);
		}
		
		public String toString() {
			return String.format("%s (%d)", name, score);
		}
		
	}
}
