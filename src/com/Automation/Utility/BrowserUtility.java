package com.Automation.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserUtility {
	
	public static WebDriver OpenBrowser(WebDriver driver, String browserName, String url) throws InterruptedException
	{
		if (browserName.equals("Chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			Thread.sleep(5000);
			return driver;
		}
		else if(browserName.equals("IE"))
		{
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get(url);
			Thread.sleep(5000);
			return driver;
		}
		else if(browserName.equals("Firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			Thread.sleep(5000);
			return driver;
		}
		return null;
			
	}

}
