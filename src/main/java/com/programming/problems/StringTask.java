package com.programming.problems;

public class StringTask {
	
	/*
	 * Main logic
	 * @param word:string
	 * @return word:string 
	 */
	public String convert(String word) {
		word = removeVowels(word);
		word = insertPeriodBeforeConsonant(word);
		
		return word.toLowerCase();
	}
	
	/*
	 * string without vowels
	 * 
	 * @param word:string
	 * @return word:string 
	 */
	public String removeVowels(String word) {	
		word = word.replaceAll("[aeiouyAEIOUY]", "");
		return word;
	}

	/*
	 * insert the periods before every consonant
	 * 
	 * @param word:string 
	 * @return word:string 
	 */
	public String insertPeriodBeforeConsonant(String word) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < word.length(); i++){
			sb.append(".");
			sb.append(word.charAt(i));
		}
		
		return sb.toString();
	}

	
}
