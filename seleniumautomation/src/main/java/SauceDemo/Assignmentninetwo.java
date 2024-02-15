package SauceDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignmentninetwo {

	public static void main(String[] args) throws InterruptedException 
	
	{
	    WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://preview.colorlib.com/theme/bootstrap/multiselect-07/");
        driver.findElement(By.xpath("//div[@class=\"default text\"]")).click();
        Thread.sleep(20000);
        List<WebElement>single=driver.findElements(By.xpath("//div[@class=\"menu transition visible\"]/div"));////div[@class=\"menu transition visible\"]
	    System.out.println(single.size());
	    for(WebElement alldd:single)
	    {
		System.out.println(alldd.getText().equals(single));
		alldd.click();
		}
	
	
	}
}
