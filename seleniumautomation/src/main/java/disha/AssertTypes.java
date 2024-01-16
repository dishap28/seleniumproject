package disha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertTypes {

	//AssertEquals() is a method used to compare the actual and expected results. 
	//If both the actual and expected results are same, then the assertion pass with no exception 
	//and the test case is marked as "passed".
	
	
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		WebElement logo =driver.findElement(By.xpath("//img[@class=\'bot_column\']"));
			boolean swagLogo = logo.isDisplayed();
        Assert.assertTrue(swagLogo);
        System.out.println(swagLogo);
		
		
		//assertion true for check boxes//
		driver.get("https://www.makemytrip.com/flights/");
		driver.findElement(By.xpath("//span[@class='tabsCircle appendRight5']//parent::li[@class='selected']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//span[@class='tabsCircle appendRight5']//parent::li[@class='selected']")).isSelected());
		System.out.println((driver.findElement(By.xpath("//span[@class='tabsCircle appendRight5']//parent::li[@class='selected']")).isSelected()));
//		
//		
        
     
	}
	
	
	

}
