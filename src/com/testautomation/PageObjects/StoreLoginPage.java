package com.testautomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class StoreLoginPage {
	
	WebDriver driver;
	
	public StoreLoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="userEmail")
	public WebElement LoginEmailTextBox;
	
	@FindBy(how=How.ID,using="userPassword")
	public WebElement LoginPasswordTextBox;
	
	@FindBy(how=How.ID,using="loginButton")
	public WebElement LoginButton;
	
	@FindBy(how=How.LINK_TEXT,using="Not yet a customer?")
	public WebElement RegisterPageLink;
	
	public void enterUserName(String userName) throws InterruptedException
	{
		Thread.sleep(2000);
		LoginEmailTextBox.sendKeys(userName);
	}
	
	public void enterPassword(String password) throws InterruptedException
	{
		Thread.sleep(2000);
		LoginPasswordTextBox.sendKeys(password);
	}
	
	public void clickLoginButton() throws InterruptedException
	{
		Thread.sleep(3000);
		LoginButton.click();
	}
	
	public void navigateToRegisterPage() throws InterruptedException
	{
		Thread.sleep(3000);
		RegisterPageLink.click();
		
	}
}
