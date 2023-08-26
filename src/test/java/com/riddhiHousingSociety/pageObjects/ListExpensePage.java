package com.riddhiHousingSociety.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ListExpensePage {


	WebDriver ldriver;

	public ListExpensePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Expenses']")
	@CacheLookup
	WebElement Expenses_link;
	
	@FindBy(xpath="/html/body/aside/ul/li[6]/ul/li[2]/a")
	@CacheLookup
	WebElement list_expenses_link;
	
	@FindBy(xpath="/html/body/main/div/div/div[1]/div/form/div/div[2]/input")
	@CacheLookup
	WebElement from_date_tb;
	
	@FindBy(xpath="/html/body/main/div/div/div[1]/div/form/div/div[3]/input")
	@CacheLookup
	WebElement to_date_tb;
	
	@FindBy(xpath="//select[@id='selectbox']")
	@CacheLookup
	WebElement select_empoloyee_drpdwn;
	
	@FindBy(xpath="//button[@name='submit']")
	@CacheLookup
	WebElement search_btn;
	
	
	//Action methods
	

			public void clickExpense()
			{
				Expenses_link.click();
			}
			
			public void clicListExpense()
			{
				list_expenses_link.click();
			}
			
			public void setFromDate(String dd, String mm, String yyyy)
			{
//				from_date_tb.clear();
				from_date_tb.sendKeys(dd);
				from_date_tb.sendKeys(mm);
				from_date_tb.sendKeys(yyyy);
			}
			
			public void setToDate(String day, String mon, String year)
			{
//				to_date_tb.clear();
				to_date_tb.sendKeys(day);
				to_date_tb.sendKeys(mon);
				to_date_tb.sendKeys(year);
			}
			
			public void selectEmpoloyeeDrpdwn()
			{
				select_empoloyee_drpdwn.click();
				WebElement drp = ldriver.findElement(By.xpath("//select[@id='selectbox']"));
				Select select= new Select(drp);
				select.selectByIndex(2);
			}
			
			public void clickSearch()
			{
				search_btn.click();
			}
	
}
