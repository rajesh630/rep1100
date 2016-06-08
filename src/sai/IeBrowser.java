package sai;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeBrowser 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.ie.driver","C:\\Users\\qedge\\Downloads\\IEDriverServer.exe");
	InternetExplorerDriver driver=new InternetExplorerDriver();
	driver.get("Http://Yahoo.com");
	
}
}
