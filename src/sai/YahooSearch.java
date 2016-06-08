package sai;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSearch
{

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://in.yahoo.com/?p=us");
		driver.manage().window().maximize();
driver.findElement(By.id("UHSearchBox")).sendKeys("selenium");
driver.findElement(By.id("UHSearchWeb")).click();
	}

}
