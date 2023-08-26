package com.riddhiHousingSociety.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewReceiptPage {


	WebDriver ldriver;

	public ViewReceiptPage(WebDriver rdriver)
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
	
	@FindBy(id="sampleTable_previous")
	@CacheLookup
	WebElement previous_link;
	
	@FindBy(id="sampleTable_next")
	@CacheLookup
	WebElement next_link;
	
//	@FindBy(name="from_date")
//	@CacheLookup
//	WebElement From_date_tb;
//	
//	@FindBy(name="to_date")
//	@CacheLookup
//	WebElement To_date_tb;
//	
//	@FindBy(name="submit")
//	@CacheLookup
//	WebElement search_btn;
	
//	@FindBy(xpath="//input[@type='search']")
//	@CacheLookup
//	WebElement search_tb;
	
	@FindBy(xpath="//a[text()='View Receipt']")
	@CacheLookup
	WebElement viewReceipt_link;//https://tronsoftech.in/projects/riddhi/list_receipts.php?role=Customer
	

	@FindBy(xpath="//tbody/tr[7]/td[12]/div[1]/button[1]")
	@CacheLookup
	WebElement Actions_btn;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']//a[@title='Edit Receipt'][normalize-space()='Edit']")
	@CacheLookup
	WebElement edit_link;
	
	
	
	// edit receipts page
	@FindBy(name="files")
	@CacheLookup
	WebElement transaction_proof_tb;
	
	@FindBy(xpath="//button[@name='submit']")
	@CacheLookup
	WebElement submit_btn;
	
	
	//Action methods for all WebElements
	public void clickReceipts()
	{
		receipts_link.click();
	}

	public void clickViewReceipts()
	{
		view_receipts_link.click();
	}
	
	public void clickPrevious()
	{
		previous_link.click();
	}
	
	public void clickNext()
	{
		next_link.click();
	}
	
//	public void setFromDate(String dd, String mm, String yyyy)
//	{
//		From_date_tb.sendKeys(dd);
//		From_date_tb.sendKeys(mm);
//		From_date_tb.sendKeys(yyyy);
//	}
//	
//	public void setToDate(String DD, String MM, String YYYY)
//	{
//		To_date_tb.sendKeys(DD);
//		To_date_tb.sendKeys(MM);
//		To_date_tb.sendKeys(YYYY);
//	}
//	
//	public void clickSearchBtn()
//	{
//		search_btn.click();
//	}
//	
//	public void setSearch(String search)
//	{
//		search_tb.sendKeys(search);;
//	}
	
	public void clickViewReceipt()
	{
		viewReceipt_link.click();
	}
	
	public void clickActionsLink()
	{
		Actions_btn.click();
	}
	
	public void clickEditLink()
	{
		edit_link.click();
	}
	
	public void setTransactionProof(String proof)
	{
		transaction_proof_tb.sendKeys(proof);;
	}
	


}
