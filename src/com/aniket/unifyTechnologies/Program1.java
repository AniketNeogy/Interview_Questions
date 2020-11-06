package com.aniket.unifyTechnologies;

public class Program1 {

	public static void main(String[] args) {
		String str = "aabbccdeff";
		/*
		 * expected output :
		 * a:2 b:2 c:2 d:1 e:1 f:2
		 */
		/*for(int i=0;i<str.length();) {
			int count=0;
			int j;
			for (j = i; j < str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
				else
				{
					System.out.print(str.charAt(i)+":"+count+"  ");
					break;
				}
			}
			if(j==str.length())
				System.out.print(str.charAt(i)+":"+count+"  ");
			i=j;
		}*/
		int counter = 1;
		int i = 0;
		for (; i < str.length()-1; i++) {
				if(str.charAt(i) == str.charAt(i+1)) {
					counter++;
				}
				else {
					System.out.println(str.charAt(i)+" : "+counter);
					counter=1;
				}
		}
		System.out.println(str.charAt(i)+" : "+counter);
	}

}
