package com.riddhiHousingSociety.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EditContentPage {

	WebDriver ldriver;

	public EditContentPage(WebDriver rdriver)
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
	
	@FindBy(xpath="//select[@name='sampleTable_length']")
	@CacheLookup
	WebElement show_entries_drpdwn;
	
	@FindBy(xpath="//input[@type='search']")
	@CacheLookup
	WebElement search_tb;
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/div[1]/button[1]")
	@CacheLookup
	WebElement Actions_btn;
	
	@FindBy(xpath="(//a[text()='Edit'])[1]")
	@CacheLookup
	WebElement Edit_link;
	
	@FindBy(xpath="//select[@id='select']")
	@CacheLookup
	WebElement Select_section_drpdwn;
	
	@FindBy(xpath="//*[@id=\"first-name\"]")
	@CacheLookup
	WebElement Content_title_tb;
	
	@FindBy(name="price")
	@CacheLookup
	WebElement Content_charges_tb;
	
	@FindBy(name="sequence")
	@CacheLookup
	WebElement Content_sequence_tb;
	
	@FindBy(name="alt_tag")
	@CacheLookup
	WebElement Content_img_alt_tag_tb;
	
	@FindBy(name="contentdesc")
	@CacheLookup
	WebElement Content_description_tb;
	
	@FindBy(name="content_date")
	@CacheLookup
	WebElement Date_tb;
	
	@FindBy(name="content_location")
	@CacheLookup
	WebElement Location_tb;
	
	@FindBy(name="link")
	@CacheLookup
	WebElement Add_link_tb;
	
	@FindBy(id="fupImage")
	@CacheLookup
	WebElement Image_tb;
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement Submit_btn;
	
	
	//Action method for All WebElements
	
	public void clickContents()
	{
		Contents_link.click();
	}

	public void clickViewContents()
	{
		View_contents_link.click();
	}
	
	public void ShowEntriesDrodwn()
	{
		show_entries_drpdwn.click();
		WebElement drp = ldriver.findElement(By.xpath("//select[@name='sampleTable_length']"));
		Select select= new Select(drp);
		select.selectByIndex(3);
	}
	
	public void searchText(String text)
	{
		search_tb.sendKeys(text);
	}
	
	public void clickActions()
	{
		Actions_btn.click();
	}
	public void clickEdit()
	{
		Edit_link.click();
	}

	public void clickSelectSectionDropdown()
	{
		Select_section_drpdwn.click();

		WebElement drp = ldriver.findElement(By.xpath("//select[@id='select']"));
		Select select= new Select(drp);
		select.selectByIndex(4);
	}

	public void setContentTitle(String title)
	{
		Content_title_tb.sendKeys(title);
	}

	public void setContentCharges(String charges)
	{
		Content_charges_tb.sendKeys(charges);
	}

	public void setContentSequence(String sequence)
	{
		Content_sequence_tb.sendKeys(sequence);
	}

	public void setContentImgAltTag(String imgalttag)
	{
		Content_img_alt_tag_tb.sendKeys(imgalttag);
	}

	public void setContentDescription(String description)
	{
		Content_description_tb.sendKeys(description);
	}

	public void setDate(String dd, String mm, String yyyy)
	{
		Date_tb.sendKeys(dd);
		Date_tb.sendKeys(mm);
		Date_tb.sendKeys(yyyy);
	}

	public void setLocation(String location)
	{
		Location_tb.sendKeys(location);
	}

	public void setAddLink(String link)
	{
		Add_link_tb.sendKeys(link);
	}

	public void setImage(String image )
	{
		Image_tb.sendKeys(image);
	}
	

	public void clickSubmit()
	{
		Submit_btn.click();;
	}
	
	
	
}
