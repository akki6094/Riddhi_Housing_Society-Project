package com.riddhiHousingSociety.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
    
	// for login to the application.
	@FindBy(name="myusername")
	
	@CacheLookup
	WebElement txtUsername;

	
	@FindBy(name="mypassword")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath="//button[text()='SIGN IN']")
	@CacheLookup
	WebElement signinBtn;
	
	// For Logout from the application
	@FindBy(xpath="//a[@class='app-nav__item']")
	@CacheLookup
	WebElement adminLink;
	
	@FindBy(xpath="(//a[@class='dropdown-item'])[2]")
	@CacheLookup
	WebElement logoutLink;

	public void setUsername(String uname)
	{
		txtUsername.sendKeys(uname);
	}

	public void setPassword(String pass)
	{
		txtPassword.sendKeys(pass);
	}

	public void clickSignIn()
	{
		signinBtn.click();
	}
	
	public void clictAdminLink()
	{
		adminLink.click();
	}
	
	public void clickLogoutLink()
	{
		logoutLink.click();
	}
}
