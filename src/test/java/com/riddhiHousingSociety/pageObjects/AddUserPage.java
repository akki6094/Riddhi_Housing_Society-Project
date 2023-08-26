package com.riddhiHousingSociety.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddUserPage {


	WebDriver ldriver;

	public AddUserPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="/html/body/aside/ul/li[5]/a/span")
	@CacheLookup
	WebElement userLink;

	@FindBy(xpath="/html/body/aside/ul/li[5]/ul/li[1]/a")
	@CacheLookup
	WebElement Add_userLink;

	@FindBy(id="role")
	@CacheLookup
	WebElement roll_drpdwn;

	@FindBy(name="fullname")
	@CacheLookup
	WebElement fullname_tb;

	@FindBy(name="mobile")
	@CacheLookup
	WebElement mobile_number_tb;

	@FindBy(name="password")
	@CacheLookup
	WebElement password_tb;

	@FindBy(name="landline")
	@CacheLookup
	WebElement alternate_number_tb;

	@FindBy(name="email")
	@CacheLookup
	WebElement email_tb;

	@FindBy(name="address")
	@CacheLookup
	WebElement address_tb;

	@FindBy(name="gender")
	@CacheLookup
	WebElement gender_drpdwn;

	@FindBy(xpath="(//input[@class='form-control'])[6]")
	@CacheLookup
	WebElement adhar_number_tb;

	@FindBy(xpath="(//input[@class='form-control'])[7]")
	@CacheLookup
	WebElement pan_number_tb;

	@FindBy(name="submit")
	@CacheLookup
	WebElement submit_btn;


	//Action methods
	public void clickUser()
	{
		userLink.click();
	}

	public void clickAddUser()
	{
		Add_userLink.click();
	}

	public void clickRollDrpdwn()
	{
//		roll_drpdwn.click();
		WebElement drp = ldriver.findElement(By.name("gender"));
		Select select= new Select(drp);
		select.selectByValue("Male");
	}

	public void setFullName(String name)
	{
		fullname_tb.clear();
		fullname_tb.sendKeys(name);
	}

	public void setMobileNumber(String number)
	{
		mobile_number_tb.clear();
		mobile_number_tb.sendKeys(number);
	}


	public void setPassword(String pass)
	{
		password_tb.clear();
		password_tb.sendKeys(pass);
	}

	public void setAlternetNumber(String Alt_number)
	{
		alternate_number_tb.clear();
		alternate_number_tb.sendKeys(Alt_number);
	}

	public void setEmail(String email)
	{
		email_tb.clear();
		email_tb.sendKeys(email);
	}

	public void setAddress(String address)
	{
		address_tb.clear();
		address_tb.sendKeys(address);
	}

	public void setGenderDrpdwn()
	{
		gender_drpdwn.click();
		WebElement drp = ldriver.findElement(By.id("role"));
		Select select= new Select(drp);
		select.selectByIndex(1);
	}


	public void setAdharNumber(String adhar)
	{
		adhar_number_tb.clear();
		adhar_number_tb.sendKeys(adhar);
	}


	public void setPanNumber(String pan)
	{
		pan_number_tb.clear();
		pan_number_tb.sendKeys(pan);
	}


	public void clickSubmitBtn()
	{
		submit_btn.click();
	}

}
