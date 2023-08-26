package com.riddhiHousingSociety.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddContentPage {

	WebDriver ldriver;

	public AddContentPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//span[text()='Contents']")
	@CacheLookup
	WebElement contents_link;

	@FindBy(xpath="//a[normalize-space()='Add New Content']")
	@CacheLookup
	WebElement add_new_Contents_Link;

	@FindBy(xpath="//select[@id='select']")
	@CacheLookup
	WebElement select_section_drpdown;

	@FindBy(id="first-name")
	@CacheLookup
	WebElement content_title_tb;

	@FindBy(name="price")
	@CacheLookup
	WebElement content_charges_tb;

	@FindBy(name="sequence")
	@CacheLookup
	WebElement content_sequence_tb;

	@FindBy(name="alt_tag")
	@CacheLookup
	WebElement content_img_alt_tag_tb;

	@FindBy(name="contentdesc")
	@CacheLookup
	WebElement content_description_tb;

	@FindBy(name="content_date")
	@CacheLookup
	WebElement date_tb;

	@FindBy(name="content_location")
	@CacheLookup
	WebElement location_tb;

	@FindBy(name="link")
	@CacheLookup
	WebElement add_link_tb;

	@FindBy(id="fupImage")
	@CacheLookup
	WebElement image_tb;
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement submit_btn;

	// Action methods for all the elements
	public void clickContents()
	{
		contents_link.click();
	}

	public void clickAddNewContents()
	{
		add_new_Contents_Link.click();
	}

	public void clickSelectSectionDropdown()
	{
		select_section_drpdown.click();

		WebElement drp = ldriver.findElement(By.xpath("//select[@id='select']"));
		Select select= new Select(drp);
		select.selectByIndex(3);
	}

	public void setContentTitle(String title)
	{
		content_title_tb.sendKeys(title);
	}

	public void setContentCharges(String charges)
	{
		content_charges_tb.sendKeys(charges);
	}

	public void setContentSequence(String sequence)
	{
		content_sequence_tb.sendKeys(sequence);
	}

	public void setContentImgAltTag(String imgalttag)
	{
		content_img_alt_tag_tb.sendKeys(imgalttag);
	}

	public void setContentDescription(String description)
	{
		content_description_tb.sendKeys(description);
	}

	public void setDate(String dd, String mm, String yyyy)
	{
		date_tb.sendKeys(dd);
		date_tb.sendKeys(mm);
		date_tb.sendKeys(yyyy);
	}

	public void setLocation(String location)
	{
		location_tb.sendKeys(location);
	}

	public void setAddLink(String link)
	{
		add_link_tb.sendKeys(link);
	}

	public void setImage(String image )
	{
		image_tb.sendKeys(image);
	}
	

	public void clickSubmit()
	{
		submit_btn.click();;
	}

}
