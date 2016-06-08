package sai;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Profile {

	public static void main(String[] args) 
	{
		//Create Profile Object
		ProfilesIni pr=new ProfilesIni();
		//Create Fire Fox Profile And Initiating to Profile Object
		FirefoxProfile fp=pr.getProfile("Taj");
		//Launching Our Own Customized Browser
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("Http://Google.com");

	}

}
