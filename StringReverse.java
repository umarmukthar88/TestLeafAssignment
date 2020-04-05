package week1.day4;

public class StringReverse {

	public static void main(String[] args) 
	
	
	{
		// TODO Auto-generated method stub
		
		String txt="welcome";
		String revers="";
		int txtLength = txt.length();
		
		System.out.println("The Given string length is : "+txtLength);
		
		char[] txtArray = txt.toCharArray();
		

		
		for (int i = txtLength-1; i>=0 ; i--) 
		
		{
			
				char CA = txt.charAt(i);
				revers=revers+CA;

		
		}
		
		
		System.out.println("The Original string is : " + txt);
		System.out.println("The reverse string is : " + revers);
		
				
		
		

	}

}
