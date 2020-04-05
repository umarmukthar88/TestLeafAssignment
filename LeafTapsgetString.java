package week1.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsgetString 


{
public static void main(String[] args) 
	
	
	{

		System.setProperty("webdriver.chrome.driver" , "./chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
		//User Login
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		String crmLinkHeading = driver.findElementByTagName("h2").getText();
		
		
		//Print full Heading
		System.out.println(crmLinkHeading);
		
		//Get the string length
		System.out.println(crmLinkHeading.length());
		
		//Split and print the string using newline delimiter
		String[] headSplit = crmLinkHeading.split("\n");
		System.out.println("The second line of the heading is :" + headSplit[1]);	
		
		
		//Logout from leaftps
		driver.findElementByClassName("decorativeSubmit").click();
			
		
		//Close the driver
		driver.close();
		
		

	}
	
}
