package SauceDemo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertionss {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=17");
		List<WebElement>all=driver.findElements(By.xpath("//ul[@class=\"nav navbar-nav\"]/li"));
//		   System.out.println(all.size()); 
//		   for(WebElement ele:all)
//		   {
//			   System.out.println(ele.getText());
//		   }
		
		ArrayList<String>Text=new ArrayList<String>();
		{
			for( WebElement x :all){  //for each loop in JAVA
		        Text.add(x.getText());  //add "x" times text to list above
		    }
}
		}
				
}
