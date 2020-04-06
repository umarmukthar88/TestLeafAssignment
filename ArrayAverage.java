package week1.day4;

import java.util.Arrays;

public class ArrayAverage {

	public static void main(String[] args) 
	
	
	
	{
		// TODO Auto-generated method stub
		// first way to declare array
		
		int[] arr=new int[4];
		
	
		
		
		
		
		arr[0]=500;
		arr[1]=400;
		arr[2]=600;
		arr[3]=200;
		
		
		System.out.println("Array Length: "+arr.length);
		
		int[] cloneArr = arr.clone();
		
		System.out.println("Clone array value :"+cloneArr[2]);
		
		System.out.println("Way 1 Array Values : ");
		for (int i = 0; i < arr.length; i++) 
		
		
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("******************");
		///second way of declaring array
	
		
		int[] arr1= {200,500,400,100};
		System.out.println("Way 2 Array Values before sort");
		
		for (int i = 0; i < arr1.length; i++) 
			
			
		{
			System.out.println(arr1[i]);
		}
		
		System.out.println("******************");
		
		
		Arrays.sort(arr1);
		
		System.out.println("Way 2 Array Values after sort : ");
		
		for (int i = 0; i < arr1.length; i++) 
			
			
		{
			System.out.println(arr1[i]);
		}

	}

}
