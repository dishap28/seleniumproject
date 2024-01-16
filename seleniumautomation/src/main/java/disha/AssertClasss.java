package disha;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertClasss {

	@Test
	public void VerifyTest()
	{
		String expectedTitle= "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedText="search";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualText=driver.findElement(By.id("\"gh-btn\"")).getAttribute("value");
		String actualTitle=driver.getTitle();
		System.out.println("Title of the Page=" +actualTitle);
		assertEquals(expectedTitle,actualTitle);
        Assert.assertEquals(actualText,expectedText );
        System.out.println(actualTitle);
        
		
		
		

	}

}
