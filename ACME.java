package week1.day5;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ACME 

 {

	public static void main(String[] args) 
	
	
	{
		// TODO Auto-generated method stub
		
		
		

		System.setProperty("webdriver.chrome.driver" , "./chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://acme-test.uipath.com/account/login");

		
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");

		driver.findElementById("buttonLogin").click();
		
		
		WebElement action = driver.findElementByXPath("//button[text()[normalize-space()='Vendors']]");
		Actions builder = new Actions(driver);
		builder.moveToElement(action).perform();
			
		
		driver.findElementByLinkText("Search for Vendor").click();
		
			
		driver.findElementById("email").sendKeys("Blue Lagoon");

		driver.findElementById("buttonSearch").click();
		
		WebElement countryName = driver.findElementByXPath("//td[text()='France']");
			
		
		System.out.println("The Vendor Country Name is "+countryName);
		
		driver.findElementByXPath("//button[@class='navbar-toggle collapsed']").click();		
		
		driver.findElementByLinkText("Log Out").click();
		
		
	
		
		
		
	}

}
