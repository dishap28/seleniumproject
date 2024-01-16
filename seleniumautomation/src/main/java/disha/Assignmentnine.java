package disha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignmentnine {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		List<WebElement> alloption=driver.findElements(By.xpath("//select[@aria-label=\"Month\"]"));
		System.out.println(alloption.size());
        for(WebElement one:alloption)
        {
        	System.out.println(one.getText());
        }
        WebElement ele1=driver.findElement(By.id("month"));
        boolean ele2=ele1.isDisplayed();
         Assert.assertTrue(ele2);
      }
	}


