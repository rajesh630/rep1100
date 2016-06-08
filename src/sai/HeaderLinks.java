package sai;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderLinks {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Bing.com");
		driver.manage().window().maximize();
		
		WebElement header=driver.findElement(By.className("sw_tb"));
	List<WebElement> headerlinks=header.findElements(By.tagName("a"));
	System.out.println(headerlinks.size());
	for (int i = 0; i < headerlinks.size(); i++) 
	{
		System.out.println(headerlinks.get(i).getText());
	}
	}

}
