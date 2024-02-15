package SauceDemo;


import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BstackdemoWebsite {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bstackdemo.com/");
		driver.findElement(By.xpath("//select")).click();
		WebElement ele1=driver.findElement(By.xpath("//option[text()=\"Highest to lowest\"]"));
        String strexpected="Highest to lowest";
        String stractual=ele1.getText();
        System.out.println(stractual);
        Assert.assertEquals(stractual, strexpected);
        if(strexpected.equals(stractual))
        {
        	System.out.println("Strings are equal");
        }
        else
        	System.out.println("Strings are not equal");
       
	}

}
