package SauceDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionOfDates {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(20000);
		WebElement element1=driver.findElement(By.id("day"));
		Select ddown=new Select(element1);
		ddown.selectByValue("19");
		Thread.sleep(2000);
		WebElement element2=driver.findElement(By.id("month"));
		Select ddown2=new Select(element2);
		ddown2.selectByVisibleText("May");
		Thread.sleep(2000);
		WebElement element3=driver.findElement(By.id("year"));
		Select ddown3=new Select(element3);
		ddown3.selectByValue("2017");
		WebElement ele1=driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
		boolean ele2=ele1.isDisplayed();
		Assert.assertTrue(ele2);
		System.out.println(ele2);
		
	}
}
