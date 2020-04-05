package week1.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsButton 

{

	public static void main(String[] args) 
	
	
	
	{
		
		
		// add system property -> webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

		// Open the chrome browser
		// ChromeDriver (C) -> Written by Selenium Team
		ChromeDriver driver = new ChromeDriver();

		// Wait (for the element to appear for the max time: 30)
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Load the URL :: get ->
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
		//Find Login heading colour 
		
		String bgColour = driver.findElementByTagName("h2").getCssValue("background-color");
		System.out.println("The Login Header colour is in RGB format is : " +bgColour);
		
		//get the height and widht
		Dimension unameSizenormal = driver.findElementByXPath("//label[@for='username']").getSize();
		System.out.println("The username font size is : " +unameSizenormal);
		
		//get the actual font size 
		String unameSizecss = driver.findElementByXPath("//label[@for='username']").getCssValue("font-size");
		System.out.println("The username font size is : " +unameSizecss);
		
		// Find the width of the login button
			int width = driver.findElementByClassName("decorativeSubmit").getSize().getWidth();
			System.out.println("The width of login button is: "+width);
				
			
		// Find the x position of the username textbox
			WebElement eleUserName = driver.findElementById("username");
			System.out.println("The user name x cordinate position is: "+eleUserName.getLocation().getX());
		
		
		
		
		
		
		
				
				
		
		
		
		
	}
}
