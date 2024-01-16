package disha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrropDown {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/inventory.html");
		WebElement element=driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
		Select ddown=new Select(element);
//        ddown.selectByValue("za");
//		Thread.sleep(2000);
		ddown.selectByIndex(2);
         //System.out.println(ddown.isMultiple());
        // ddown.selectByValue("za");
         //Thread.sleep(2000);
         ddown.selectByIndex(3);
         Thread.sleep(2000);
         ddown.selectByVisibleText("Price (high to low)");
//         if(ddown.isMultiple())
//         {
//        	 System.out.println("ddown is multipe");
//         }
//         else
//         {
//        	 System.out.println("ddown is not multipe");
//         }
         
        List<WebElement> ele= ddown.getAllSelectedOptions();
        for(WebElement option:ele)
        {
        	System.out.println(option.getText());
        }
	
	}

}
