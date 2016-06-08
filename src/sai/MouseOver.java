package sai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.seleniumhq.jetty9.server.HttpChannelState.Action;

public class MouseOver {

	public static void main(String[] args) throws Exception {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://Flipkart.com");
		driver.manage().window().maximize();
		WebElement  elec=driver.findElement(By.xpath(".//*[@id='container']/div/div/header/div[1]/div/ul/li[1]"));
		WebElement asu=driver.findElement(By.xpath(".//*[@id='container']/div/div/header/div[1]/div/ul/li[1]/ul/li[2]/ul/li[1]/ul/li[7]/a/span"));
		Thread.sleep(5000);
		Actions mOver=new Actions(driver);
		mOver.moveToElement(elec).build().perform();
		mOver.moveToElement(asu).click().build().perform();
	}

}
