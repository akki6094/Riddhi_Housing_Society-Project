package com.riddhiHousingSociety.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ListResidentPage {


	WebDriver ldriver;

	public ListResidentPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="/html/body/aside/ul/li[5]/a/span")
	@CacheLookup
	WebElement users_link;
	
	@FindBy(xpath="//a[normalize-space()='List Residents']")
	@CacheLookup
	WebElement list_resident_link;

	@FindBy(xpath="//select[@name='sampleTable_length']")
	@CacheLookup
	WebElement show_entries_drpdwn;

//	@FindBy(xpath="//input[@type='search']")
//	@CacheLookup
//	WebElement search_tb;

	@FindBy(partialLinkText="view-user.php?userid=70")
	@CacheLookup
	WebElement view_link;

	//update profile data
	@FindBy(xpath="//a[@class='nav-link']")
	@CacheLookup
	WebElement update_prifile_link;

	@FindBy(xpath="//select[@name='wing']")
	@CacheLookup
	WebElement Wing_Row_house_tb;

	@FindBy(xpath="//input[@placeholder='Enter house or flat number']")
	@CacheLookup
	WebElement House_number_tb;


	@FindBy(xpath="//button[@name='submit']")
	@CacheLookup
	WebElement save_btn;


	//Action methods

	public void clickUsers()
	{
		users_link.click();
	}
	
	public void clickListResident()
	{
		list_resident_link.click();
	}

	public void showEntriesDrpdwn()
	{
		show_entries_drpdwn.click();
		WebElement drp = ldriver.findElement(By.xpath("//select[@name='sampleTable_length']"));
		Select select= new Select(drp);
		select.selectByIndex(3);	
	}

//	public void setSerach(String search)
//	{
//		search_tb.sendKeys(search);	
//	}
	
	public void clickView()
	{
		view_link.sendKeys();	
	}
	
	public void clickUpdateProfile()
	{
		update_prifile_link.click();	
	}
	
	public void setWingDrpdwn()
	{
		Wing_Row_house_tb.click();
		WebElement drp = ldriver.findElement(By.xpath("//select[@name='wing']"));
		Select select= new Select(drp);
		select.selectByIndex(2);
	}
	
	public void setHouseNumber(String house)
	{
		House_number_tb.sendKeys(house);	
	}

	public void clickSaveBtn()
	{
		save_btn.click();
	}

}
