package disha;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindow {

	public static void main(String[] args) throws Exception
	{
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://phntechnology.com/");
//		String parentwindow=driver.getWindowHandle();
//		System.out.println(parentwindow+ " parent window");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
       String parenthandle=driver.getWindowHandle();
        Thread.sleep(2000);
		driver.findElement(By.id("newWindowBtn")).click();
       Set<String> childwindow=driver.getWindowHandles();
       Thread.sleep(2000);
        for(String handle:childwindow)
        {
        	System.out.println(handle);
        	if(handle!=parenthandle)
        	{
//        		driver.switchTo().window(handle);
//        		Thread.sleep(2000);
//        		driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("disha");
//        		Thread.sleep(2000);
        	}
        }
        
        
	}

}
