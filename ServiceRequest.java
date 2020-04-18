package week3.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ServiceRequest {

	public static void main(String[] args) throws InterruptedException 
	
	
	
	{
		// TODO Auto-generated method stub
		
		// add system property -> webdriver.chrome.driver
				System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

				// Open the chrome browser
				// ChromeDriver (C) -> Written by Selenium Team
				

				
				
				ChromeDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				driver.get("https://dev92474.service-now.com/");
				
				driver.manage().window().maximize();
				
				//Login to Service Now application
				driver.switchTo().frame("gsft_main");
				
				driver.findElementById("user_name").sendKeys("admin");
				
				driver.findElementById("user_password").sendKeys("India@123");
				
				driver.findElementById("sysverb_login").click();
				
				driver.switchTo().defaultContent();
				
				
				//3. Enter Incident in filter navigator and press enter
				
				driver.findElementById("filter").sendKeys("Incident");
				//driver.findElementById("filter").sendKeys(Keys.ENTER);
				
				Thread.sleep(3000);
				//4. Click on Create new option Under Incident
				driver.findElementByXPath("(//div[text()='Create New'])").click();
				
				//driver.findElementByXPath("((//div[text()='Create New'])[1]").click();
				Thread.sleep(3000);
				
				
				//driver.switchTo().frame("gsft_main");
							
				//driver.findElementById("sysverb_new").click();
				
				//get the incident Number
				
				driver.switchTo().frame("gsft_main");
				
				String incidentNumber = driver.findElementById("incident.number").getAttribute("value");
				
				System.out.println(incidentNumber);
				
				
				
				//6. Click on the Search Button Available in the Caller Field & Choose First Value Opened in the new Window
				
				
					driver.findElementById("lookup.incident.caller_id").click();
				
					String fWindow = driver.getWindowHandle();

					Set<String> allWin = driver.getWindowHandles();
					List<String> lst = new ArrayList<String>(allWin);
					driver.switchTo().window(lst.get(1));
					
					driver.findElementByClassName("glide_ref_item_link").click();
					
					driver.switchTo().window(fWindow);
				
				// 7. Select the Value as Software in Category Field
					
					driver.switchTo().frame("gsft_main");
					
					WebElement categorydd = driver.findElementById("incident.category");
					Select dd = new Select(categorydd);
					dd.selectByVisibleText("Software");
					
					
				//8.8. Select Internal Application in Sub Category Field
					
					WebElement subCategorydd = driver.findElementById("incident.subcategory");
					
					Select dd2 = new Select(subCategorydd);
					
					dd2.selectByVisibleText("Internal Application");
					
				
				//	 9. Select Walk-in in Contact Type Field	
					
					WebElement contactTypedd = driver.findElementById("incident.contact_type");
					
					Select dd3 = new Select(contactTypedd);
					
					dd3.selectByVisibleText("Walk-in");
					
					
				//10. Select state as In-Progress 
						
					WebElement statedd = driver.findElementById("incident.state");
					
					Select dd4 = new Select(statedd);
					
					dd4.selectByVisibleText("In Progress");
					
					
				//	11. Select Urgency as High 	
					
					
					
					WebElement urgencydd = driver.findElementById("incident.urgency");
					
					Select dd5 = new Select(urgencydd);
					
					dd5.selectByVisibleText("1 - High");
				
					
					//12. Click on the Search Button Available in the Assignment Group & Choose Last Residing Value Opened in new Window
						
					driver.findElementById("lookup.incident.assignment_group").click();
					
					
					Set<String> assignGroupWin = driver.getWindowHandles();
					List<String> lst2 = new ArrayList<String>(assignGroupWin);
					driver.switchTo().window(lst2.get(1));
					driver.findElementByLinkText("Openspace").click();
					driver.switchTo().window(fWindow);
					
					//13. Enter Short Description as "Creating Incident For the Purpose of Management"
					
					driver.switchTo().frame("gsft_main");
					driver.findElementById("incident.short_description").sendKeys("Creating Incident For the Purpose of Management");
					
					
					
					//14. Click on the Submit Button
					
					driver.findElementById("sysverb_insert").click();
					
				
					
					//15. Enter The Incident Number Newly created in Search Field and Press Enter
					driver.findElementByXPath("(//input[@class='form-control'])[1]").sendKeys(incidentNumber);
					Thread.sleep(2000);
					
					driver.findElementByXPath("(//input[@class='form-control'])[1]").sendKeys(Keys.ENTER);
				
					//16. Click on the newly Created Incident Displayed
					
					driver.findElementByXPath("//a[@class='linked formlink']").click();
					
					
					
					//17. Verify the Incident Number
					String resIncident = driver.findElementById("incident.number").getAttribute("value");
					if (resIncident.equals(incidentNumber))
					{
						System.out.println("Required incident number selected.The Incident Number is :"+resIncident);
						
						//18. Update Impact as High
						
				
						WebElement impactdd = driver.findElementById("incident.impact");
						
						Select dd6 = new Select(impactdd);
						
						dd6.selectByVisibleText("1 - High");
						
						
						//19. Update Description as "Successfully Created an incident"
						
						driver.findElementById("incident.description").sendKeys("Successfully Created an incident");
						
						
						
						//20. Enter Work Notes as "Done Right"
						
						driver.findElementById("activity-stream-work_notes-textarea").sendKeys("done");
						
					
						//21. Click on the Update button.
						
						driver.findElementById("sysverb_update").click();
								
						
						//22. Logout and Close
				
						
						
						driver.findElementByXPath("//span[contains(@class,'user-name hidden-xs')]").click();
						driver.findElementByLinkText("Logout").click();
						
						driver.switchTo().frame("gsft_main");
						
						WebElement userID = driver.findElementById("user_name");
						
						
						if (userID.isDisplayed()) 
						
						
						
						{
							
							
							System.out.println("Logout Successfull from service Now application");
							driver.close();
							
						}
						
						
						
						else 
						
						
						
						{
							
							System.out.println("Logout Failed");
							driver.close();

						}
									
					} 
					
					else
					
					
					
					{
						System.out.println("required incident number not found");
						driver.close();

					}
				 
					

									 

	}

}
