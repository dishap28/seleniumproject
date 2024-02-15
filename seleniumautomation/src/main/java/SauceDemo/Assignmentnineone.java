package SauceDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignmentnineone {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		List<WebElement>all=driver.findElements(By.id("month"));
		System.out.println("below all the list of dropdown");
		for(WebElement dd:all)
		{
			System.out.println(dd.getText());
		
		if(dd.getText().equalsIgnoreCase("Feb"))
		{
			dd.click();
			System.out.println("selected options "+dd.getText());
			
		}

	}

}
}
