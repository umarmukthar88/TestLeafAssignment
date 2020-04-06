package week1.assignment;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateLead 




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
			
			
			//Search and Open Lead
			
			driver.findElementById("ext-gen255").sendKeys("umar");
		
			
			driver.findElementById("ext-gen341").click();
			
			WebElement leadRecord = driver.findElementByLinkText("umar");
			
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
			
			String newCompanyName="NewTLName";
			
			driver.findElementByLinkText("Edit").click();
			
			driver.findElementById("updateLeadForm_companyName").clear();
			
			driver.findElementById("updateLeadForm_companyName").sendKeys(newCompanyName);
			
			driver.findElementByName("submitButton").click();
			
			
			//Verify new company name changed after update
			
			String companyName = driver.findElementById("viewLead_companyName_sp").getText();
			
			if (companyName.contains(newCompanyName)) 
			
			
				{
					System.out.println("Company Name Update Successfull with the name : "+newCompanyName);
				}
			
			
			
			else
			
			
				{
					System.out.println("Company Name Update Failed");
				}
			
			
			
	}
	
}
