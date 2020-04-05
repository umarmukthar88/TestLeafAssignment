package week1.day4;

public class PrintNextChar {

	public static void main(String[] args) 
	
	
	{
		// TODO Auto-generated method stub
		
		
		
		String srcChar="A1B2C3";
		String destChar="";
		
	//Logic to convert the from A1B2CD3 to B2C3D4
		
		for (int i=0;i<srcChar.length();i++)
			
		{
			//Find the AscII value of source character
			//Add +1 with the value 
			//Typecast again the char with num 
			
			
			char cA = srcChar.charAt(i);
			int ascNum=cA+1;
			char ascChar=(char) ascNum;
			
			 destChar=destChar+ascChar;
		
			
			
			
		}
		
		//Print both source and destination
			
		System.out.println("The Source  string is : "+ srcChar);
		System.out.println("The converted string is : "+ destChar);
		
	}

}
 