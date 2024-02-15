package SauceDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductCount {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.makemytrip.com/");
//		List<WebElement>productName=driver.findElements(By.xpath("//p[@class=\"latoBlack blackText font10 appendBottom10 capText\"]"));
//		System.out.println(productName.size());
//		for(WebElement abc:productName)
//		{
//			System.out.println(abc.getText());
//		}
//		List<WebElement>AllDescrpt=driver.findElements(By.xpath("//ul[@class='footNav__list']"));
//		for(WebElement current :AllDescrpt)
//		{
//			System.out.println(current.getText());
//		}
           driver.get("https://www.google.com/");
          WebElement element= driver.findElement(By.name("q"));  
        		  element.sendKeys("selenium");
        		  Thread.sleep(10000);
        	List<WebElement>allsugge=driver.findElements(By.xpath("//textarea[@class=\"gLFyf\"]"));	  
        		  System.out.println(allsugge.size());
        		  Thread.sleep(10000);
        		  for(WebElement suggestion:allsugge)
        		  {
        			  System.out.println(suggestion.getText());
        		  }
		
		

	}

}
