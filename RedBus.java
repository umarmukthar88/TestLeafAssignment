package week1.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) 
	
	
	{
		// TODO Auto-generated method stub
		
		
		

		System.setProperty("webdriver.chrome.driver" , "./chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		
		//implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Open URl
		driver.get("https://www.redbus.in/");
		
		
		//Search Bus details
		
		driver.findElementById("src").sendKeys("chennai",Keys.TAB);
		
		
		
	   //Thread.sleep(3000);
		
		driver.findElementById("dest").sendKeys("bangalore",Keys.TAB);
	
		driver.findElementByXPath("(//td[text()='29'])[2]").click();
		
		driver.findElementById("search_btn").click();
		
		
		//Filer bus details
		driver.findElementByXPath("(//label[@class='cbox-label'])[4]").click();
		
		driver.findElementByXPath("//label[@title='SLEEPER']").click();
		
		driver.findElementByXPath("(//div[contains(@class,'w-15 fl')]//a)[2]").click();
		
		driver.close();
		
		
	}

}
