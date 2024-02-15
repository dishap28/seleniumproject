package SauceDemo;

import io.github.bonigarcia.wdm.WebDriverManager;



import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class WithoutSelect_DropDown {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://preview.colorlib.com/theme/bootstrap/multiselect-04/");
		driver.findElement(By.xpath("//div[text()=\"Nothing selected\"]")).click();
		List<WebElement>all1=driver.findElements(By.xpath("//ul[@class=\"dropdown-menu inner show\"]/li"));
        for(WebElement all2:all1) {
        	System.out.println(all2.getText());
        	
        	
        }
	}

}
