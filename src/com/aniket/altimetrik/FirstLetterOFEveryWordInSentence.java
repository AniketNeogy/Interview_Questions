/**
 * Print first letter of every word in the string 
 
 Given a string S, the task is to output a string with the first letter of every word in the string.
 

Example 1:

Input: geeks for geeks
Output: gfg
Explanation: First alphabet of every word 
required.
Example 2:

Input: bad is good
Output: big
Explanation: First alphabet of every word 
required.
 */

package com.aniket.altimetrik;

public class FirstLetterOFEveryWordInSentence {

	public static void main(String[] args) {
		String s = "geeks for geeks is good";
		String output = "";
		String[] words = s.split(" ");
		for (String word : words) {
			output = output + word.charAt(0);
		}
		
		System.out.println(output);

	}

}
