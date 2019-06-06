package com.testautomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class StoreSearchPage {
	
WebDriver driver;
	
	public StoreSearchPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="//span[@translate='TITLE_LOGIN']")
	public WebElement LoginLink;
	
	@FindBy(how=How.CLASS_NAME,using="form-control ng-pristine ng-valid ng-empty ng-touched")
	public WebElement SearchTextBox;
	
	@FindBy(how=How.ID,using="searchButton")
	public WebElement SearchButton;
	
	public void navigateToLogin() throws InterruptedException
	{
		Thread.sleep(3000);
		LoginLink.click();;
	}
	
	public void searchStore(String textToSearch) throws InterruptedException
	{
		Thread.sleep(3000);
		SearchTextBox.sendKeys(textToSearch);
		SearchButton.click();
	}

}
