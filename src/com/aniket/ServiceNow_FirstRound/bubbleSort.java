package com.aniket.ServiceNow_FirstRound;

public class bubbleSort {

	public static void main(String[] args) {
		int [] myArray  = {5,7,2,4,6,8,1};
		
		for (int i = 0; i < myArray.length-1; i++) {
			for (int j = i+1; j < myArray.length; j++) {
				if(myArray[i]>myArray[j]) {
					int temp = myArray[i];
					myArray[i]=myArray[j];
					myArray[j] = temp;
					}
			}
		}
		
		for (int i : myArray) {
			System.out.print(i+",");
		}

	}

}
