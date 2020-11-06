package com.aniket.unifyTechnologies;

public class Program3 {
	
	private static void printStudentNameWithMaxScores(String str) {
		
		
	}

	public static void main(String[] args) {
		String str = "ABC:001-857, RAM:002-567, HULK$%^#:003-987, PHIL:004-321, XYZ:001-857";
		/*
		 * Problem statement is to remove the student info with special character in the name
		 * i.e we have to remove "HULK$%^#:003-987" from the above string.
		 * Then we need to print the name of the student with maximum test score
		 * i.e here ABC and XYZ both have 857 score hence we need print :  
		 * ABC
		 * XYZ
		 */
		printStudentNameWithMaxScores(str);
	}

}
