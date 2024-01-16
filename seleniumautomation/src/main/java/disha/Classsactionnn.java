package disha;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classsactionnn {

	public static void main(String[] args) 
	{
	                  //Right click//
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://vinothqaacademy.com/mouseevent/");
		WebElement element=driver.findElement(By.id("rightclick"));
		Actions action1=new Actions (driver);
		action1.contextClick(element).perform();
        driver.switchTo().alert().accept();
		
		                 //Double Click//
		WebElement all=driver.findElement(By.id("dblclick"));
		Actions act=new Actions(driver);
		act.doubleClick(all).build().perform();
		driver.switchTo().alert().accept();
		
//		                //Drag and Drop//
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source=driver.findElement(By.id("box5"));
		WebElement designation=driver.findElement(By.id("box103"));
		Actions acts=new Actions(driver);
		acts.dragAndDrop(source, designation).build().perform();
		acts.doubleClick(source).moveToElement(designation).build().perform();
		
		               
//		              //Mouse Hover //
//		driver.get("https://stqatools.com/demo/MouseHover.php");
//		WebElement source=driver.findElement(By.xpath("//button[@class=\"dropbtn\"]"));
//		Actions act=new Actions(driver);
//		act.moveToElement(source).build().perform();
		
		
		         //Keyboard events//
		
	
	
	}

}
