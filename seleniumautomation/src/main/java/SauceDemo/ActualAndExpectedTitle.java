package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActualAndExpectedTitle {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/form-3/");
		driver.findElement(By.id("first_name")).sendKeys("disha");
		Thread.sleep(2000);
		driver.findElement(By.id("last_name")).sendKeys("pise");
		Thread.sleep(2000);
		driver.findElement(By.id("user_email")).sendKeys("disha@gmail.com");
		driver.findElement(By.id("user_url")).sendKeys("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("user_pass")).sendKeys("Disha@12345$&");
		driver.findElement(By.id("user_confirm_password")).sendKeys("Disha@12345$&");
		driver.findElement(By.id("check_box_1530100860_Choice3")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("radio_1530100861_Femalie")).click();
		WebElement element=driver.findElement(By.xpath("//select[@id=\"country_1507714747\"]"));
		Select ddown=new Select(element);
        ddown.selectByValue("AU");
		Thread.sleep(2000);
		driver.findElement(By.id("textarea_1507714757")).sendKeys("abcd");
		driver.findElement(By.id("number_box_1507716030")).sendKeys("7627555566");
		Thread.sleep(2000);
		WebElement element1=driver.findElement(By.id("select_1507714760"));
		Select dddown=new Select(element1);
		dddown.selectByValue("Option 3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"ur-button-container \"]//child::button")).click();
		Thread.sleep(10000);
		WebElement text1=driver.findElement(By.xpath("//li[text()='Email already exists.']"));
		String actualText = text1.getText();
		System.out.println(actualText);
		String expText=("Email already exists.");
		Assert.assertEquals(actualText,expText);
		
		
	
	}

}
