package week1.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException 
	
	
	{
		// TODO Auto-generated method stub
		
		
		

		System.setProperty("webdriver.chrome.driver" , "./chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		
		//implicit Wait
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Open URl
		driver.get("https://www.redbus.in/");
		
		
		//Search Bus details
		
		driver.findElementById("src").sendKeys("chennai");
		Thread.sleep(2000);
		driver.findElementById("src").sendKeys(Keys.TAB);
		
		
		
	    Thread.sleep(5000);
//	    driver.findElementById("src").click();
		
		driver.findElementById("dest").sendKeys("bangalore");
		Thread.sleep(2000);
	    driver.findElementById("dest").sendKeys(Keys.TAB);
	
		driver.findElementByXPath("(//td[text()='29'])[2]").click();		
		
		driver.findElementById("search_btn").click();
		
		Thread.sleep(5000);
		
		//Filer bus details
		driver.findElementByXPath("(//label[@class='cbox-label'])[4]").click();
		
		driver.findElementByXPath("//label[@title='SLEEPER']").click();
		
		driver.findElementByXPath("(//div[contains(@class,'w-15 fl')]//a)[2]").click();
		
		driver.close();
		
		
	}

}
