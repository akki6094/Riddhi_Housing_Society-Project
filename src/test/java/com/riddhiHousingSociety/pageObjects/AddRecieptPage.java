package com.riddhiHousingSociety.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddRecieptPage {


	WebDriver ldriver;

	public AddRecieptPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="(//span[@class='app-menu__label'])[4]")
	@CacheLookup
	WebElement receipts_link;

	@FindBy(xpath="//a[text()=' Add Receipt']")
	@CacheLookup
	WebElement Add_receipts_link;

	@FindBy(name="userid")
	@CacheLookup
	WebElement resident_drpdwn;

	@FindBy(name="payment_desc")
	@CacheLookup
	WebElement payment_for_tb;

	@FindBy(name="mode_of_payment")
	@CacheLookup
	WebElement payment_mode_drpdwn;

	@FindBy(name="total_amount")
	@CacheLookup
	WebElement total_amount_tb;

	@FindBy(name="received_amount")
	@CacheLookup
	WebElement received_amount_tb;

	@FindBy(name="payment_note")
	@CacheLookup
	WebElement transaction_details_tb;

	@FindBy(xpath="//button[@name='submit']")
	@CacheLookup
	WebElement submit_btn;


	//Action methods

	public void clickReceipts()
	{
		receipts_link.click();
	}

	public void clickAddReceipts()
	{
		Add_receipts_link.click();
	}

	public void residentDropdown()
	{
		resident_drpdwn.click();

		WebElement drp = ldriver.findElement(By.name("userid"));
		Select select= new Select(drp);
		select.selectByIndex(5);
	}
	

	public void setPaymentFor(String Rent)
	{
		payment_for_tb.sendKeys(Rent);
	}

	public void paymentModeDrpdwn()
	{
		payment_mode_drpdwn.click();

		WebElement drp = ldriver.findElement(By.name("mode_of_payment"));
		Select select= new Select(drp);
		select.selectByIndex(2);
	}
	
	public void setTotalAmount(String tatal_amount)
	{
		total_amount_tb.sendKeys(tatal_amount);
	}

	public void setReceivedAmount(String ramount)
	{
		received_amount_tb.sendKeys(ramount);
	}

	public void setTransactionDetails(String transaction)
	{
		transaction_details_tb.sendKeys(transaction);
	}

	public void clickSubmit()
	{
		submit_btn.click();
	}
}
