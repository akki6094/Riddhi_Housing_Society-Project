package com.riddhiHousingSociety.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteReceiptPage {

	
	WebDriver ldriver;

	public DeleteReceiptPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="(//span[@class='app-menu__label'])[4]")
	@CacheLookup
	WebElement receipts_link;
	
	@FindBy(xpath="//a[@href='list_receipts.php?role=Customer']")
	@CacheLookup
	WebElement view_receipts_link;
	

	@FindBy(id="dropdownMenuButton")
	@CacheLookup
	WebElement Actions_btn;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']//a[@class='dropdown-item'][normalize-space()='Delete']")
	@CacheLookup
	WebElement Delete_link;
	
	
	
	//Action methods
	public void clickReceipts()
	{
		receipts_link.click();
	}

	public void clickViewReceipts()
	{
		view_receipts_link.click();
	}
	
	public void clickActionsLink()
	{
		Actions_btn.click();
	}
	
	public void clickDelete()
	{
		Delete_link.click();
	}
}
