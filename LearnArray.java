package week1.day4;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) 
	
	
	
	{
		// TODO Auto-generated method stub
		// first way to declare array
		
		int[] arr=new int[4];
		
	
		
		
		
		
		arr[0]=500;
		arr[1]=400;
		arr[2]=600;
		arr[3]=200;
		
		
		int arrLength = arr.length;
		int sum=0;
		float average=0;
		
			
		for (int i = 0; i < arr.length; i++) 
		
		
		{
			sum=sum+arr[i];
		}
		
		System.out.println("The Sum of the array value is : "+sum);
	
		
		average=sum/arrLength;
		
		System.out.println("The Average of the array value is : "+average);

	}

}
