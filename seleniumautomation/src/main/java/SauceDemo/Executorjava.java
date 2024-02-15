package SauceDemo;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Executorjava {

	public static void main(String[] args)
	{
		          // print text//
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("alert(\"hello world\")");
		
		             //By id Sendkeys//
		
////		driver.get("https://www.facebook.com/");
//		WebElement element=driver.findElement(By.id("\"email\""));
////		JavascriptExecutor jse=(JavascriptExecutor) driver;
////		jse.executeScript("document.getElementById(\"email\").value=\"disha@gmail.com\";");
////		String text=(String)js.executeScript("\"document.getElementById(\\\"email\\\").value");
////		  System.out.println(text);             
//		           
		            //print title of the web page
//		  driver.get("https://www.facebook.com/");
//		  JavascriptExecutor jse=(JavascriptExecutor) driver;
//		  jse.executeScript()
//		  
		

	}

	
	}