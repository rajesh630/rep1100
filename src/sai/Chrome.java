package sai;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\qedge\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("Http://Facebook.com");

	}

}
