package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClasses {

	public static void main(String[] args) 
	{
		//right click 
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://demoqa.com/buttons");
//		Actions action=new Actions(driver);
//		action.contextClick().build().perform();
//		WebElement element=driver.findElement(By.id("rightClickBtn"));
//		element.click();
//		action.contextClick(element).build().perform();
		
		//double click
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		Actions action=new Actions(driver);
		WebElement element1=driver.findElement(By.id("dblClkBtn"));
		action.doubleClick(element1).build().perform();
		System.out.println("double click is done");
		
		
	}

}
