package com.aniket.ServiceNow_FirstRound;

import java.util.HashSet;
import java.util.Set;

public class Program1 {

	public static void main(String[] args) {
		int [] myArray  = {1,2, 3, 1, 2, 5,7};
		Set<Integer> myset =  new HashSet<Integer>();
		for (int i : myArray) {
			myset.add(i);
		}
		
		System.out.println(myset.toString());

	}

}
