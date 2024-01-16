package disha;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcccepAndismiss {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://vinothqaacademy.com/alertandpopup/");
		driver.findElement(By.name("confirmalertbox")).click();
		Thread.sleep(2000);
		Alert element=driver.switchTo().alert();
		element.dismiss();

	}

}
