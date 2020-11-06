package com.aniket.altimetrik;
/**
 * 
 * Given a string of digits 0 – 9. The task is to count number of substrings which when convert into integer form an even number.
 *
Examples:

Input : s = "1234".
Output : 6
"2", "4", "12", "34", "234", "1234" 
are 6 substring which are even.

Input : s = "154".
Output : 3

Input : s = "15".
Output : 0

 */

public class CountEvenSubstrings {

	public static void main(String[] args) {
		String s = "1234";
		int output = 0;
		for (int i = 0; i <= s.length()-1; i++) {
			for (int j = i+1; j <= s.length(); j++) {
				int val = Integer.parseInt(s.substring(i, j));
				if(val%2==0) {
					output=output+1;
				}
			}
		}
		
		System.out.println(output);
	}

}
