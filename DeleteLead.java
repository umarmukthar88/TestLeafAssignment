package week1.assignment;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead 




{
public static void main(String[] args) throws InterruptedException 
	
	
	{

	// TODO Auto-generated method stub
	
	
	// add system property -> webdriver.chrome.driver

			System.setProperty("webdriver.chrome.driver" , "./chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			
			
			//Implicit wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			
			
			//OPen URL
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			driver.manage().window().maximize();
			
		
			//User Login
			

			
			
			driver.findElementById("username").sendKeys("DemoSalesManager");
			driver.findElementByName("PASSWORD").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			
			driver.findElementByLinkText("CRM/SFA").click();
			
			//go to lead creation page and click find lead
			
			driver.findElementByLinkText("Leads").click();
			driver.findElementByLinkText("Find Leads").click();
			
			
			//Search and Open Lead by phone number
			//	1 9178456
			//driver.findElementById("ext-gen860").click();
			
		
			driver.findElementById("ext-gen247__ext-gen261").click();
			
			driver.findElementById("ext-gen277").sendKeys("9546");
			driver.findElementById("ext-gen341").click();
			
			//get the lead ID 		
			
			String leadIDColl = driver.findElementByXPath("//table[@class='x-grid3-row-table']").getText();
			String[] LeadID = leadIDColl.split("\n");
			System.out.println("The captured Lead ID is : " + LeadID[0]);
			
			
			
			
			//Click on the first record and get the title of the lead page
			WebElement leadRecord = driver.findElementByLinkText(LeadID[0]);
			leadRecord.click();
			System.out.println("The tile of view Lead page conntains : "+driver.getTitle());
			
			
			
			//Verify Lead page opened 
			String leadTitle = driver.getTitle();
			if (leadTitle.contains("View Lead"))
				
			{
				
				System.out.println("View Lead page opened successfully");
							
			} 
			
			
			else 
			
			{

				System.out.println("View Lead page not found ");
			}
		
			
			//Edit Lead 
			
						
			driver.findElementByLinkText("Delete").click();
			driver.findElementByLinkText("Leads").click();
			driver.findElementByLinkText("Find Leads").click();
						
			driver.findElementById("ext-gen253").sendKeys(LeadID[0]);
			driver.findElementById("ext-gen341").click();
			
			
			
			
			
			
			
			
			//Verify no record display after delete
			String searchResult = driver.findElementById("ext-gen444").getText();
			
			
			if (searchResult.contains("No records")) 
			
			
				{
					System.out.println("Lead deleted successfully and the deleted lead number is   : "+LeadID[0]);
				}
			
			
			
			else
			
		
				{
						System.out.println("Lead deletion failed");
				}
			
			driver.close();
			
			
	}
	
}
