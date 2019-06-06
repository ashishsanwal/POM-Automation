package com.testautomation.StepDef;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Automation.Utility.BrowserUtility;
import com.Automation.Utility.PropertiesFileReader;
import com.testautomation.PageObjects.StoreLoginPage;
import com.testautomation.PageObjects.StoreRegistrationPage;
import com.testautomation.PageObjects.StoreSearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StoreRegistrationStepDef {

	public static WebDriver driver;
	PropertiesFileReader obj= new PropertiesFileReader();
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		
		Properties properties = obj.getProperty();
		
        BrowserUtility.OpenBrowser(driver, properties.getProperty("browser.name"), properties.getProperty("browser.baseURL"));
	}

	@Given("^User Navigates to LogIn Page$")
	public void user_Navigates_to_LogIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//WebElement login = driver.findElement(By.xpath("//a[@href='#/login']"));
		new StoreSearchPage(driver).navigateToLogin();
		
		Thread.sleep(2000);
		
		//wait.until(ExpectedConditions.visibilityOf(login)); //this will wait for elememt to be visible for 20 seconds
		//login.click(); //now it clicks on element
		//driver.manage().timeouts().implicitlyWait(200000, TimeUnit.SECONDS);
		//throw new PendingException();
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		StoreLoginPage storeLoginPage = new StoreLoginPage(driver);
		storeLoginPage.enterUserName("test@peter.com");
		storeLoginPage.enterPassword("12345");
		storeLoginPage.clickLoginButton();
//		driver.findElement(By.id("userEmail")).sendKeys("test@peter.com"); 	 
//	    driver.findElement(By.id("userPassword")).sendKeys("12345");
//	    driver.findElement(By.id("loginButton")).click();
//	    driver.manage().timeouts().implicitlyWait(200000, TimeUnit.SECONDS);
//	    Thread.sleep(3000);
	    //throw new PendingException();
	}
	

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login Successfully");
		driver.manage().timeouts().implicitlyWait(200000, TimeUnit.SECONDS);
	    //throw new PendingException();
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement logout = driver.findElement(By.xpath("//a[@href='#/logout']"));
		WebDriverWait wait = new WebDriverWait(driver, 200000); //here, wait time is 20 seconds
		wait.until(ExpectedConditions.visibilityOf(logout)); //this will wait for elememt to be visible for 20 seconds
		logout.click(); //now it clicks on element
		Thread.sleep(3000);
		driver.quit();

	    //throw new PendingException();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("LogOut Successfully");
	    //throw new PendingException();
		Thread.sleep(3000);
	}
	
	@When("^User Navigates to Register Page$")
	public void user_Navigates_to_Register_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		new StoreLoginPage(driver).navigateToRegisterPage();
//		driver.findElement(By.xpath("//a[@href='#/register']")).click();
//		driver.manage().timeouts().implicitlyWait(200000, TimeUnit.SECONDS);
//	    //throw new PendingException();
//		Thread.sleep(3000);
	}

	@When("^User enters Email and Password and Repeat Password and Security Question$")
	public void user_enters_Email_and_Password_and_Repeat_Password_and_Security_Question() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.id("userEmail")).sendKeys("test@peter.com");
//		Thread.sleep(2000);
//		driver.findElement(By.id("userPassword")).sendKeys("12345");
//		Thread.sleep(2000);
//		driver.findElement(By.id("userPasswordRepeat")).sendKeys("12345");
//		Thread.sleep(2000);
//		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
//		driver.findElement(By.id("securityQuestion")).click();
//		Thread.sleep(2000);
//		Select dropdown = new Select(driver.findElement(By.id("securityQuestion")));
//		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		dropdown.selectByIndex(2);
//		Thread.sleep(2000);
//		driver.findElement(By.id("securityAnswer")).sendKeys("peters");
//		Thread.sleep(2000);
//		driver.findElement(By.id("registerButton")).click();
//		driver.manage().timeouts().implicitlyWait(200000, TimeUnit.SECONDS);
//		Thread.sleep(2000);
//	    //throw new PendingException();
		
		StoreRegistrationPage storeRegisterationPage = new StoreRegistrationPage(driver);
		storeRegisterationPage.enterRegisterEmail("test@peter.com");
		storeRegisterationPage.enterRegisterPassword("12345");
		storeRegisterationPage.enterRegisterRepeatPassword("12345");
		storeRegisterationPage.enterRegisterSecretQuestion("Your eldest siblings middle name?");
		storeRegisterationPage.enterRegisterSecretAnswer("Peters");
		
	}

	@Then("^User is displayed Login Page$")
	public void user_is_displayed_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//if (driver.findElement(By.id("userEmail"))){
		
		//}
	    //throw new PendingException();
	}

}
