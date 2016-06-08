package sai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args)
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Google.com");
		driver.manage().window().maximize();
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
	Actions rghtClick=new Actions(driver);
	rghtClick.contextClick(gmail).sendKeys("T").build().perform();
	}

}
