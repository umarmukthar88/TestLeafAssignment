package week1.day5;

import java.util.concurrent.TimeUnit;

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
		
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Open URL
		driver.get("https://acme-test.uipath.com/account/login");

		
		
		//Login
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");

		driver.findElementById("buttonLogin").click();
		
		
		//Search Vendor
		
		WebElement action = driver.findElementByXPath("//button[text()[normalize-space()='Vendors']]");
		Actions builder = new Actions(driver);
		builder.moveToElement(action).perform();
		driver.findElementByLinkText("Search for Vendor").click();
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		driver.findElementById("buttonSearch").click();
		
		//get CountryName
		
		WebElement countryName = driver.findElementByXPath("//td[text()='France']");
			
		countryName.getText();
		System.out.println("The Vendor Country Name is "+countryName);
		
		//driver.findElementByXPath("//button[@class='navbar-toggle collapsed']").click();		
		
		driver.findElementByLinkText("Log Out").click();
		
		
	
		
		
		
	}

}
