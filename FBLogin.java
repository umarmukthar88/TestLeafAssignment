package week1.day2;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin 


{
public static void main(String[] args) 
	
	
	{

		System.setProperty("webdriver.chrome.driver" , "./chromedriver.exe");
		
	
		
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		
		//User Login
		
		
		
		
		driver.findElementById("email").sendKeys("tt@tt.com");
		driver.findElementById("pass").sendKeys("test");
		driver.findElementById("loginbutton").click();

		
		
			
		driver.close();
		
		

	}
	
}
