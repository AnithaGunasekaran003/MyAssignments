package week1.day2;

import java.util.Arrays;

public class LearnArrays {
	
	public static void main(String[] args) {
		
		int[] scores = {100,98,87,80,67};
		
		//to find length of array
		int total = scores.length;
	
	System.out.println("The total length of array is : " + total);
	
	// to retrieve a single element out of array
	System.out.println("single value is : " + scores[4]);
	
	//to print all values in array
	for(int i=0;i<total;i++)
	{
		System.out.println(scores[i]);
	}
	
	//to find min value ; first is should be sorted
	Arrays.sort(scores);
	System.out.println("the minimum value is : " + scores[0]);
	System.out.println("the maximum value is : " + scores[4]);
	System.out.println("the maximum value is : " + scores[total-1]);
	System.out.println("the second maximum value is : " + scores[total-2]);
	}

}
