package com.riddhiHousingSociety.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListTenantsPage {


	WebDriver ldriver;

	public ListTenantsPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[text()='Users']")
	@CacheLookup
	WebElement users_link;
	
	@FindBy(xpath="/html/body/aside/ul/li[5]/ul/li[4]/a")
	@CacheLookup
	WebElement list_tenants_link;
	
	@FindBy(xpath="//*[@id=\"sampleTable\"]/tbody/tr/td[7]/a[1]")
	@CacheLookup
	WebElement View_link;
	
	@FindBy(xpath="//*[@id=\"myTab\"]/li[2]/a")
	@CacheLookup
	WebElement update_profile_link;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	@CacheLookup
	WebElement save_btn;
	
	@FindBy(xpath="//input[@placeholder='Aadhar Card Number']")
	@CacheLookup
	WebElement adhar_number_tb;

	@FindBy(xpath="//input[@placeholder='PAN Card Number']")
	@CacheLookup
	WebElement pan_number_tb;
	
	
	//Action methods
	

	public void clickUsers()
	{
		users_link.click();
	}
	
	public void clickListTenants()
	{
		list_tenants_link.click();
	}
	
	public void clickView()
	{
		View_link.click();
	}
	
	public void clickUpdateProfile()
	{
		update_profile_link.click();
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
	
	public void clickSave()
	{
		save_btn.click();
	}
}
