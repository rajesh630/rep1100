package sai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class CheckBox {

	public static void main(String[] args) throws Exception {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Taj");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("Http://Gmail.com");
		driver.findElement(By.id("Email")).sendKeys("vasu.584");
		driver.findElement(By.id("next")).click();
		Thread.sleep(5000);
		
		//driver.findElement(By.id("PersistentCookie")).click();
		WebElement check=driver.findElement(By.id("PersistentCookie")); 
		System.out.println(check.getAttribute("checked"));
		if (check.isSelected()) 
		{
			check.click();
			System.out.println(check.getAttribute("checked"));
		}
	}

}
