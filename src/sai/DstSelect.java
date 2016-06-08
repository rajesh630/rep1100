package sai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DstSelect {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://eenadu.net");
		driver.manage().window().maximize();
		WebElement dSelect=driver.findElement(By.xpath(".//*[@id='dist-option']"));
		
		Select dlist=new Select(dSelect);
		//dlist.selectByIndex(6);
        dlist.selectByValue("district/main.aspx?dsname=kadapa");
        //dlist.selectByVisibleText("Kadapa");
	}

}
