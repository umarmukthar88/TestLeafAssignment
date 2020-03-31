package week1.day2;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToTL 


{
public static void main(String[] args) 
	
	
	{

		System.setProperty("webdriver.chrome.driver" , "./chromedriver.exe");
		
	
		
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		
		//driver.close();
		
		

	}
	
}
