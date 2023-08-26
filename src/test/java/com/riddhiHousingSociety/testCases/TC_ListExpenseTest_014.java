package com.riddhiHousingSociety.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.riddhiHousingSociety.pageObjects.ListExpensePage;
import com.riddhiHousingSociety.pageObjects.LoginPage;

public class TC_ListExpenseTest_014 extends BaseClass {


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
		ListExpensePage listexpense =new ListExpensePage(driver);
		handleScrollbarVerical();
		listexpense.clickExpense();
		listexpense.clicListExpense();
//		listexpense.setFromDate("23", "02", "2023");
//		Thread.sleep(3000);
//		listexpense.setToDate("12", "12", "2023");
//		Thread.sleep(3000);
		listexpense.selectEmpoloyeeDrpdwn();
		Thread.sleep(3000);
		listexpense.clickSearch();
		
	}
}
