package SauceDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectionDropDownWithoutUsingSelect {

	public static void main(String[] args)
	{
		//to get all dropdown list, print,count
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		List<WebElement>element=driver.findElements(By.xpath("//ul[@class=\"multiselect-container dropdown-menu\"]//li"));
      	System.out.println(element.size());
      	for(int i=0;i<element.size();i++) 
      	{
	       System.out.println(element.get(i).getText());
	        
		 if(element.get(i).getText().contains("jQuery"))
		 {
			 element.get(i).click();
		 }
		 
      	}
	}	

}
//package disha;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Dummy {
//
//	public static void main(String[] args) 
//	{
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://preview.colorlib.com/theme/bootstrap/multiselect-07/");
//		driver.findElement(By.xpath("//div[@class=\"label ui selection fluid dropdown multiple\"]")).click();
//		List<WebElement>elements=driver.findElements(By.xpath("//select[@name=\"skills\"]/option"));
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		List<String>actualtopic=new ArrayList<>();
//        actualtopic.add("Family");
//        actualtopic.add("Friends");
//        actualtopic.add("Work");
//        //List<String> expectedTopics = new ArrayList<>();
//        for(WebElement element : elements) 
//        	if(actualtopic.contains(element.getText())) 
//        	{
//        		element.click();
//        	}
//        	
//	}
//	
//	}
//
//
//
//
//  
//  	
//	
//
//
