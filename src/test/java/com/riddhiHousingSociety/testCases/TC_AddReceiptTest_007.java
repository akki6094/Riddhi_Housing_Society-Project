package com.riddhiHousingSociety.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.riddhiHousingSociety.pageObjects.AddRecieptPage;
import com.riddhiHousingSociety.pageObjects.LoginPage;

public class TC_AddReceiptTest_007 extends BaseClass {


	@Test
	public void addReceiptTest() throws InterruptedException, IOException
	{
		logger.info("Login Starts");
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(USERNAME);
		lp.setPassword(PASSWORD);
		lp.clickSignIn();
		logger.info("Login Successfully");
		
		
		logger.info("***** addReceiptTest test is start *****");
		AddRecieptPage addreceipt = new AddRecieptPage(driver);
		addreceipt.clickReceipts();
		addreceipt.clickAddReceipts();
		addreceipt.residentDropdown();
		addreceipt.setPaymentFor("Rent");
		addreceipt.paymentModeDrpdwn();
		addreceipt.setTotalAmount("4000");
		addreceipt.setReceivedAmount("3000");
		addreceipt.setTransactionDetails("Gpay");
		addreceipt.clickSubmit();
		
		boolean success = driver.findElement(By.xpath("//div[@class='alert alert-success']")).isDisplayed();
		if(success==true)
		{
			logger.info("***** addReceiptTest is pass *****");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("***** addReceiptTest is failed *****");
			captureScreen(driver, "addReceiptTest");
			Assert.assertTrue(false);
		}
		
		
	
	}
}
