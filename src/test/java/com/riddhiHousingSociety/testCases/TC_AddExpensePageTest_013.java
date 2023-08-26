package com.riddhiHousingSociety.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.riddhiHousingSociety.pageObjects.AddExpensePage;
import com.riddhiHousingSociety.pageObjects.LoginPage;

public class TC_AddExpensePageTest_013 extends BaseClass {

	@Test
	public void addExpenseTest() throws InterruptedException, IOException
	{
		logger.info("Login Starts");
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(USERNAME);
		lp.setPassword(PASSWORD);
		lp.clickSignIn();
		logger.info("Login Successfully");
		
		logger.info("***** addExpenseTest is Start *****");
		AddExpensePage addexpense =new AddExpensePage(driver);
		addexpense.clickExpense();
		addexpense.clickAddExpense();
		addexpense.setExpenseDoneBy("Akshay");
		addexpense.settExpenseAmount("3000");
		addexpense.selectExpenseTYpeDrpdwn();
		addexpense.selectExpenseModeDrpdwn();
		addexpense.setDate("12", "05", "2023");
		addexpense.setNote("Expense added");
		addexpense.clickSubmit();
		logger.info("***** Expense is Added *****");
		
		boolean success = driver.findElement(By.xpath("//div[@class='alert alert-success']")).isDisplayed();
		if(success==true)
		{
			logger.info("***** addExpenseTest is pass *****");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("***** addExpenseTest is failed *****");
			captureScreen(driver, "addExpenseTest");
			Assert.assertTrue(false);
		}
		
		logger.info("***** addExpenseTest is End *****");
	}
}
