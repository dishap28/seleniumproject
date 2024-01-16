package disha;



//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NameAndPrice {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/"); 
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
//		List<WebElement> allNames=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
//		System.out.println(allNames.size());
//		for(WebElement elements : allNames)
//		{
//		     String productName = elements.getText();
//		     System.out.println(productName);
//		     
//		}
		
			
			
		
		
		
	}

}
