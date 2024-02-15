package SauceDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AllXpath {

	public static void main(String[] args) throws InterruptedException 
	{
		//contains method//
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		String Exp_title=("https://login.salesforce.com/");
		String Act_title=driver.getTitle();
		System.out.println(Act_title);
		Assert.assertEquals(Exp_title, Act_title);
//		
		if(Exp_title.equals(Act_title)==true)
		{
			System.out.println("Test is Passed");
		}
		else
		{
			System.out.println("Test is Failed");
		}
	    
		//Xpath Axes/ parent/ child/ self/ //
		//WebDriverManager.chromedriver().setup();
	  //WebDriver driver=new ChromeDriver();
	   //driver.get("https://saucelabs.com/request-demo");
	   //driver.findElement(By.xpath("//select[@id=\"Solution_Interest__c\"]//parent::select")).click();
	
	       // child axes//
	       // driver.get("https://saucelabs.com/request-demo");
	        //driver.findElement(By.xpath("//select[@id=\"Solution_Interest__c\"]//child::option[6]")).click();
	
		//self axes//
		//driver.get("https://saucelabs.com/request-demo");
		//driver.findElement(By.xpath("//select[@id=\\\"Solution_Interest__c\\\"]//self::select")).click();
		
		
		
	
	}

}
