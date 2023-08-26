package com.riddhiHousingSociety.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddExpensePage {

	WebDriver ldriver;

	public AddExpensePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Expenses']")
	@CacheLookup
	WebElement Expenses_link;
	
	@FindBy(xpath="/html/body/aside/ul/li[6]/ul/li[1]/a")
	@CacheLookup
	WebElement add_expenses_link;
	
	@FindBy(xpath="//input[@placeholder='Enter Name']")
	@CacheLookup
	WebElement expense_done_by_tb;
	
	@FindBy(xpath="//input[@placeholder='Enter Expense Amount (only digits)']")
	@CacheLookup
	WebElement expense_amount_tb;
	

	@FindBy(xpath="//div[3]//div[1]//select[1]")
	@CacheLookup
	WebElement expense_type_drpdwn;
	

	@FindBy(name="expense_mode")
	@CacheLookup
	WebElement expense_mode_drpdwn;

	@FindBy(xpath="//input[@name='expense_date']")
	@CacheLookup
	WebElement date_tb;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Note']")
	@CacheLookup
	WebElement note_tb;
	
	@FindBy(xpath="//button[@name='submit']")
	@CacheLookup
	WebElement submit_btn;
	
	//Action methods
	

		public void clickExpense()
		{
			Expenses_link.click();
		}
		
		public void clickAddExpense()
		{
			add_expenses_link.click();
		}
		
		public void setExpenseDoneBy(String expensedoneby)
		{
			expense_done_by_tb.clear();
			expense_done_by_tb.sendKeys(expensedoneby);
		}
		
		public void settExpenseAmount(String expenseamount)
		{
			expense_amount_tb.clear();
			expense_amount_tb.sendKeys(expenseamount);
		}
		
		public void selectExpenseTYpeDrpdwn()
		{
			expense_type_drpdwn.click();
			WebElement drp = ldriver.findElement(By.xpath("//div[3]//div[1]//select[1]"));
			Select select= new Select(drp);
			select.selectByIndex(2);
			
		}


		public void selectExpenseModeDrpdwn()
		{
			expense_mode_drpdwn.click();
			WebElement drp = ldriver.findElement(By.name("expense_mode"));
			Select select= new Select(drp);
			select.selectByIndex(2);
		}
		
		public void setDate(String dd, String mm, String yyyy)
		{
			date_tb.clear();
			date_tb.sendKeys(dd);
			date_tb.sendKeys(mm);
			date_tb.sendKeys(yyyy);
		}
		
		public void setNote(String note)
		{
			note_tb.clear();
			note_tb.sendKeys(note);
		}
		
		public void clickSubmit()
		{
			submit_btn.click();
		}
}

