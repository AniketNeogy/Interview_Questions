package com.aniket.medtronics;

public class TestClass {
	

	public static void main(String[] args) {
		String s1 = "661116331666553322766";
		int count=1;
		int i= 0;
		for (; i < s1.length()-1;i++) {
			if(s1.charAt(i)==s1.charAt(i+1)) {
				count++;
			}
			else {
				System.out.println(s1.charAt(i)+" :: "+count);
				count=1;
			}
		}
		System.out.println(s1.charAt(i)+" :: "+count);
	}

}
