package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlacedOrder {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/inventory.html");
		driver.findElement(By.xpath("//div[text()='29.99']//following-sibling::button[@class=\"btn_primary btn_inventory\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"shopping_cart_container\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"btn_action checkout_button\"]")).click();
		driver.findElement(By.id("first-name")).sendKeys("disha");
		driver.findElement(By.id("last-name")).sendKeys("pise");
		driver.findElement(By.id("postal-code")).sendKeys("413707");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"btn_primary cart_button\"]")).click();

	}

}
