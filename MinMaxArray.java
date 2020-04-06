package week1.day4;

public class MinMaxArray 


{
	
	
	public static void main(String[] args) 
	
	
	{
		int[] arr= {200,500,10,3000};
		int maxval=0;
		
		for (int i = 0; i < arr.length; i++) 
			
			
		{
			for (int j=0;j< arr.length;j++)
				
			{
				
				if (arr[i] > arr[j])
					
					maxval=arr[i];
				
				
					
			}
			
			
		}
		
		System.out.println("The Maximum value in the given array is : "+maxval);
		
	}

}
