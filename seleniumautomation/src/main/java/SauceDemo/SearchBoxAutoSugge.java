package SauceDemo;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchBoxAutoSugge {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Thread.sleep(10000);
		driver.get("https://www.google.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//textarea[@jsname=\"yZiJbe\"]")).sendKeys("selen");
		Thread.sleep(10000);
	    List<WebElement>alllist=driver.findElements(By.xpath("//li[@role=\"presentation\"]"));
	   System.out.println (alllist.size());
		
		for(WebElement ele:alllist)
		{
			System.out.println(ele.getText());  
		}

	}

}
