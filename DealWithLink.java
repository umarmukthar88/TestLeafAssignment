	package week1.day4;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.Platform;
	import org.openqa.selenium.Point;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class DealWithLink {

		public static void main(String[] args) throws InterruptedException {

			// add system property -> webdriver.chrome.driver
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

			// Open the chrome browser
			// ChromeDriver (C) -> Written by Selenium Team
			ChromeDriver driver = new ChromeDriver();

			// Wait (for the element to appear for the max time: 30)
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			// Load the URL :: get ->
			driver.get("http://leafground.com/pages/Link.html");
			
			
			WebElement eleLink = driver.findElementByLinkText("Find where am supposed to go without clicking me?");
			
			String linkURL = eleLink.getAttribute("href");
			System.out.println("The Linked URL is : "+linkURL );
			
			
			
			//Verify am I broken
			
			driver.findElementByLinkText("Verify am I broken?").click();
			
			String title = driver.getTitle();
			
			
			if (title.contains("404")) 
			
			{
			

				
				System.out.println("The Links is broken");
				
				
				
			}
			
			
			else
				
			{
				

				
				System.out.println("The Links is fine");
				
				
				
			}
			
			driver.close();
			
		}	
			
			
			
			
			
			
		

	}



