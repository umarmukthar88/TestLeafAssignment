package week4.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChangeRequest {

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
				
				driver.findElementById("filter").sendKeys("Change");
				//driver.findElementById("filter").sendKeys(Keys.ENTER);
				
				Thread.sleep(3000);
				//4. Click on Create new option Under Incident
				driver.findElementByXPath("(//div[text()='Create New'])[3]").click();
				
				//driver.findElementByXPath("((//div[text()='Create New'])[1]").click();
				Thread.sleep(3000);
				
				
				//driver.switchTo().frame("gsft_main");
							
			//	driver.switchTo().frame("gsft_main");
			//	Thread.sleep(3000);
				
				driver.findElement(By.linkText("Normal: Changes without predefined plans require approval and/or CAB authorization.")).click();;
				
				WebElement chNumber = driver.findElementById("change_request.number");
				
				String changNumber = chNumber.getAttribute("value");	
				
				// Enter short description
				driver.findElementById("change_request.short_description").sendKeys("Creating CR");
				
				// Click submit
				driver.findElementById("sysverb_insert").click();
				
				// Enter the created Change number
				driver.findElementByXPath("//span[text()='Press Enter from within the input to submit the search.']/following::input)[1]").sendKeys(changNumber, Keys.ENTER);
				Thread.sleep(3000);
				
				// Click on  the link
				driver.findElementByClassName("linked formlink").click();
				Thread.sleep(3000);
				
				// Verify the change number
				String verifyChNum = driver.findElementById("change_request.number").getAttribute("value");
				if(changNumber.equals(verifyChNum)) {
					System.out.println("The change number is same and verified successfully");
				}
				
				// Close the browser
				driver.close();
				
	}

}
