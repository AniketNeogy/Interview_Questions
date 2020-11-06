/*

Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: strs = {"eat","tea","tan","ate","nat","bat"}
Output: {{"bat"},{"nat","tan"},{"ate","eat","tea"}}
Example 2:

Input: strs = {""}
Output: {{""}}
Example 3:

Input: strs = {"a"}
Output: {{"a"}}

 */


package com.aniket.amazon_sdet2_first_round;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BukkettingAnagrams {
	
	
	public void getAnagramBuckets(List <String> anagramList){
		Map<String,List<String>> anagramBuckets = anagramBucketingHelper(anagramList);
		for(String buckets : anagramBuckets.keySet()) {
			System.out.println(anagramBuckets.get(buckets));
		}
	}

	private Map<String, List<String>> anagramBucketingHelper(List<String> anagramList) {
		Map<String,List<String>> finalBuckets = new HashMap<String, List<String>>();
		for (String word : anagramList) {
			char wordArray[] = word.toCharArray();
			Arrays.sort(wordArray);
			String sortedWord = String.valueOf(wordArray);
			if(!finalBuckets.containsKey(sortedWord)) {
				finalBuckets.put(sortedWord, new ArrayList<String>());
			}
			finalBuckets.get(sortedWord).add(word);
			
		}
		return finalBuckets;
	}

	public static void main(String[] args) {

		List <String> anagramList = new ArrayList<String>();
		anagramList.add("eat");
		anagramList.add("tea");
		anagramList.add("tan");
		anagramList.add("ate");
		anagramList.add("nat");
		anagramList.add("bat");
		
		BukkettingAnagrams ba = new  BukkettingAnagrams();
		ba.getAnagramBuckets(anagramList);
		
	}

}
