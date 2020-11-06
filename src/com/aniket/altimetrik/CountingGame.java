package com.aniket.altimetrik;
import java.lang.*;

/**
 Shubham wrote a sequence of words. The words are written using the rules given below:

The sequence is concatenation of one or more words consisting of English letters.
All letters in the first word are lowercase.
For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
You need to find the number of words in the string.

Input:
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains a single line of input that contains the string s.

Output:
For each testcase, in a new line, print the number of words in s.

Constraints:
1<=T<=150
1<=|s|<=105

Example:
Input:
2
saveChangesInTheEditor
iAmShubam
Output:
5
3
 */

public class CountingGame {

	public static void main(String[] args) {
	
		String s = "saveChangesInTheEditor";
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				count++;
			}
			
		}
		System.out.println(count);
	
	}
	
}
