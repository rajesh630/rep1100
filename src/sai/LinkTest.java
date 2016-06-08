package sai;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest {

	public static void main(String[] args)
	{
		String expTitle="Gmail";
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Google.com");
		driver.manage().window().maximize();
		//driver.findElement(By.className("gb_P")).click();
		driver.findElement(By.linkText("Gmail")).click();
		String actTitle=driver.getTitle();
		if (expTitle.equals(actTitle)) 
		{
			System.out.println("Gmail Link Working Correctly");
		}else
		{
			System.out.println("Gmail Link Is Not Working");
		}
	}

}
