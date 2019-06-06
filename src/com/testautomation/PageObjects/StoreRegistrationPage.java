package com.testautomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StoreRegistrationPage {
	
	WebDriver driver;
	
	public StoreRegistrationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="userEmail")
	public WebElement RegistrationEmailTextBox;
	
	@FindBy(how=How.ID,using="userPassword")
	public WebElement RegistrationPasswordTextBox;
	
	@FindBy(how=How.ID,using="userPasswordRepeat")
	public WebElement RegistrationPasswordRepeatTextBox;
	
	@FindBy(how=How.ID,using="secretQuestion")
	public WebElement RegistrationSecretQuestionDropDown;
	
	@FindBy(how=How.ID,using="secretAnswer")
	public WebElement RegistrationSecretAnswerTextBox;
	
	@FindBy(how=How.ID,using="registerButton")
	public WebElement RegistrationButton;
	
	public void enterRegisterEmail(String registerEmail) throws InterruptedException
	{
		Thread.sleep(2000);
		RegistrationEmailTextBox.sendKeys(registerEmail);
	}
	
	public void enterRegisterPassword(String registerPassword) throws InterruptedException
	{
		Thread.sleep(2000);
		RegistrationEmailTextBox.sendKeys(registerPassword);
	}
	
	public void enterRegisterRepeatPassword(String registerRepeatPassword) throws InterruptedException
	{
		Thread.sleep(2000);
		RegistrationEmailTextBox.sendKeys(registerRepeatPassword);
	}
	
	public void enterRegisterSecretQuestion(String registerSecretQuestion) throws InterruptedException
	{
		Thread.sleep(2000);
		Select dropdown = new Select(RegistrationSecretQuestionDropDown);
		dropdown.selectByValue(registerSecretQuestion);
		//RegistrationEmailTextBox.sendKeys(registerSecretQuestion);
	}
	
	public void enterRegisterSecretAnswer(String registerSecretAnswer) throws InterruptedException
	{
		Thread.sleep(2000);
		RegistrationSecretAnswerTextBox.sendKeys(registerSecretAnswer);
	}
	
	public void clickRegisterButton() throws InterruptedException
	{
		Thread.sleep(3000);
		RegistrationButton.click();
		
	}
}

