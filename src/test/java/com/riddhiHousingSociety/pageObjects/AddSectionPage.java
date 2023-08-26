package com.riddhiHousingSociety.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddSectionPage {


	WebDriver ldriver;

	public AddSectionPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[text()='Sections']")
	@CacheLookup
	WebElement sectionLink;
	
	@FindBy(name="sectionname")
	@CacheLookup
	WebElement addsection;
	
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement submitbtn;
	
	@FindBy(name="sampleTable_length")
	@CacheLookup
	WebElement entriesDrpdwn;
	
	@FindBy(xpath="//input[@type='search']")
	
	@CacheLookup
	WebElement searchbox;
	
	
	
	public void clickSection()
	{
		sectionLink.click();
		
	}
	
	public void addSection(String section)
	{
		addsection.sendKeys(section);
	}
	
	public void clickSubmit()
	{
		submitbtn.click();
	}
	
	public void clickEntries()
	{
		entriesDrpdwn.click();
	}
	
	public void searchSection(String sectionName)
	{
		searchbox.sendKeys(sectionName);
	}
	
	public void select_dropdown()
	{
		WebElement drp = ldriver.findElement(By.name("sampleTable_length"));
		Select select= new Select(drp);
		select.selectByIndex(3);
	}
}


