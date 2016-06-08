package sai;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownTest1 {

	public static void main(String[] args) {
		String expItem="Jewellery";
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Amazon.in");
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> dropList=drop.findElements(By.tagName("option"));
		System.out.println(dropList.size());
		for (int i = 0; i < dropList.size(); i++) 
		{
			String actItem=dropList.get(i).getText();
			if (expItem.equals(actItem)) 
			{
				dropList.get(i).click();
			}
		}
	}

}
