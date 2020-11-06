package com.aniket.medtronics;

import java.util.Arrays;

public class TestClass2 {

	public static void main(String[] args) {
		int a[] = {-22,3,8,-9,10,9};
		Arrays.sort(a);
		int maxNegMul = a[0]*a[1];
		int maxPosMul = a[a.length-2]*a[a.length-1];
		System.out.println(maxNegMul);
		System.out.println(maxPosMul);
	}

}
