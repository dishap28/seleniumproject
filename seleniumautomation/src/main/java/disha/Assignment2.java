package disha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2
{
         /// counts of all product name///
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/inventory.html");
		List<WebElement>alltext=driver.findElements(By.xpath("//div[@class=\"inventory_item_name\"]"));
		for(WebElement allgettext:alltext)
		{
			String abc=allgettext.getText();
			System.out.println(abc);
		}
		           // counts of all links//
		List<WebElement>alllinks=driver.findElements(By.tagName("a"));
		for(WebElement allgetlinks:alllinks)
		{
			System.out.println(allgetlinks.getText()+  allgetlinks.getAttribute("href"));
	
		}
		

	}

}
