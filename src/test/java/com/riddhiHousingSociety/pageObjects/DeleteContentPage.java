package com.riddhiHousingSociety.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteContentPage {

	WebDriver ldriver;

	public DeleteContentPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//span[text()='Contents']")
	@CacheLookup
	WebElement Contents_link;
	
	@FindBy(xpath="/html/body/aside/ul/li[3]/ul/li[2]/a")
	@CacheLookup
	WebElement View_contents_link;
	
	@FindBy(xpath="//input[@type='search']")
	@CacheLookup
	WebElement search_tb;
	
	@FindBy(xpath="//*[@id=\"dropdownMenuButton\"]")
	@CacheLookup
	WebElement Actions_btn;
	
	@FindBy(xpath="//a[text()='Delete']")
	@CacheLookup
	WebElement Delete_link;
	
	
	//Action methods
	
	public void clickContents()
	{
		Contents_link.click();
	}

	public void clickViewContents()
	{
		View_contents_link.click();
	}
	
	public void searchText(String text)
	{
		search_tb.sendKeys(text);
	}
	
	public void clickActions()
	{
		Actions_btn.click();
	}
	public void clickDelete()
	{
		Delete_link.click();
	}
	
}
