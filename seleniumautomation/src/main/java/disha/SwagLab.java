package disha;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLab {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=9.99]/following-sibling::button[@class=\"btn_primary btn_inventory\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"shopping_cart_container\"]")).click();
		Thread.sleep(2000);
		WebElement productName = driver.findElement(By.xpath("//a[@id='item_0_title_link']"));
		System.out.println(productName.getText());
		String actualName ="Sauce Labs Bike Light";
		System.out.println(actualName);
		assertEquals(productName,actualName);
		
	}

}
