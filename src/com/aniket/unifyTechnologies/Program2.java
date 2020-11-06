package com.aniket.unifyTechnologies;
import java.util.ArrayList;
import java.util.List;

/*
 * If two adjacent numbers are equal the make the left as 0 and right as double the number
 * i.e if a[i]==a[i+1], then a[i]=0,a[i+1]=a[i+1]*2
 */

/*expected output :
 * 2 = 2
 * 2,4 =2,4
 * 2,4,5 = 2,4,5
 * 2,4,5,0 = 2,4,5,0
 * 2,4,5,0,0 = 2,4,5,0,0
 * 2,4,5,0,0,5 == 2,4,0,0,0,10
 * 2,4,0,0,0,10,5 = 2,4,0,0,0,10,5
 * 2,4,0,0,0,10,5,4 = 2,4,0,0,0,10,5,4
 * 2,4,0,0,0,10,5,4,8 = 2,4,0,0,0,10,5,4,8
 * 2,4,0,0,0,10,5,4,8,6 = 2,4,0,0,0,10,5,4,8,6
 * 2,4,0,0,0,10,5,4,8,6,0 = 2,4,0,0,0,10,5,4,8,6,0
 * 2,4,0,0,0,10,5,4,8,6,0,6 = 2,4,0,0,0,10,5,4,8,0,0,12
 * 2,4,0,0,0,10,5,4,8,0,0,12,8 = 2,4,0,0,0,10,5,4,8,0,0,12,8
 * 
 * finally sort all zeros to the right
 * 2,4,10,5,4,8,12,0,0,0,0,0

 */
public class Program2 {

	public static void main(String[] args) {
		int inputArray[] ={2,4,5,0,0,5,5,4,8,6,0,6,8};
		List<Integer> outputArray = new ArrayList<Integer>();
		int counter = 0;
		int zero_count=0;
		for(int i=1;i<inputArray.length;i++){
			if(inputArray[i]!=0){
				if(inputArray[counter]==inputArray[i]){
					zero_count++;
					inputArray[i]=inputArray[i]*2;
					counter=i;
				}
				else{
					outputArray.add(inputArray[counter]);
					counter=i;
				}
			}
			else
				zero_count++;
		}
		for(int j=0;j<zero_count;j++){
			outputArray.add(0); 
		}
		System.out.println("outputArray :"+outputArray.toString());

	}

}
