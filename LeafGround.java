package Week2.day3;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround 


{
public static void main(String[] args) 
	
	
	{

		System.setProperty("webdriver.chrome.driver" , "./chromedriver.exe");
		
	
		
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
		//User Login
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Click CRM Link
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Enter Lead
		
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestCompany");
		driver.findElementById("createLeadForm_firstName").sendKeys("FirstName");
		driver.findElementById("createLeadForm_lastName").sendKeys("LastName");
		driver.findElementByName("submitButton").click();
		
		//getTitle
		boolean elementDisplay=driver.findElementById("sectionHeaderTitle_leads").isDisplayed();
		System.out.println("Title Found :"+ elementDisplay);

		
		//String title=driver.getTitle();
		//System.out.println(title);
		driver.findElementByLinkText("Logout").click();
		
			
		driver.close();
		
		

	}
	
}
