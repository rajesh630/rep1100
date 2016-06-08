package sai;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLoginTest {

	public static void main(String[] args) 
	{
		String expLink="Welcome Admin";
		FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrm.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin");
	driver.findElement(By.id("btnLogin")).click();
	//System.out.println(driver.findElement(By.id("welcome")).getText());
	String actLink=driver.findElement(By.id("welcome")).getText();
	
	if (expLink.equals(actLink)) 
	{
		System.out.println("App Login Successfully");
	}else
	{
		System.out.println("App Login Fail");
	}
	}

}
