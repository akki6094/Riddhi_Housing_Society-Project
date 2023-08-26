package com.riddhiHousingSociety.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.riddhiHousingSociety.pageObjects.AddRecieptPage;
import com.riddhiHousingSociety.pageObjects.LoginPage;
import com.riddhiHousingSociety.pageObjects.ViewReceiptPage;

public class TC_Veiw_EditReceiptTest_008 extends BaseClass {

	@Test
	public void viewEditReceiptTest() throws InterruptedException, IOException
	{
		logger.info("Login Starts");
		LoginPage lp=new LoginPage(driver); //object of LoginPage
		lp.setUsername(USERNAME);
		lp.setPassword(PASSWORD);
		lp.clickSignIn();
		logger.info("Login Successfully");
		
		
		logger.info("***** viewEditReceiptTest is start *****");
		ViewReceiptPage viewreceipt = new ViewReceiptPage(driver);// object of ViewReceiptPage
		AddRecieptPage addreceipt = new AddRecieptPage(driver);   // object of AddRecieptPage
		
		// Check the functionality of element on view receipt page.
		logger.info("test webelement on view receipt page");
		viewreceipt.clickReceipts();
		viewreceipt.clickViewReceipts();
		
		viewreceipt.clickNext();
		Thread.sleep(3000);
		viewreceipt.clickPrevious();
//		viewreceipt.setFromDate("02", "04", "2023");
//		viewreceipt.setToDate("02", "08", "2023");
//		viewreceipt.clickSearchBtn();
//		viewreceipt.setSearch("91");
//		viewreceipt.clickViewReceipt();
//		logger.info("element tested successfully");
//		driver.navigate().back();
		handleScrollbarVerical();
		Thread.sleep(3000);
		handleScrollHorizontal();
		Thread.sleep(3000);
//		logger.info(" navigate to the edit receipt page");
		viewreceipt.clickActionsLink();
		viewreceipt.clickEditLink();
		
		
		//By re-using the data from AddRecieptPage 
		logger.info("***** start editing the Receipt *****");
		addreceipt.residentDropdown();
		addreceipt.setPaymentFor("House rent");
		addreceipt.paymentModeDrpdwn();
		addreceipt.setTotalAmount("10000");
		addreceipt.setReceivedAmount("5000");
		addreceipt.setTransactionDetails("Gpay");
		
		viewreceipt.setTransactionProof("C://Sign//ISTQB.jpg");
		addreceipt.clickSubmit();
		
		
		logger.info("***** verify the reciepts is edited sussessfully or not *****");
		boolean success = driver.findElement(By.xpath("//div[@class='alert alert-success']")).isDisplayed();
		if(success==true)
		{
			logger.info("***** viewEditReceiptTest is pass *****");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("***** viewEditReceiptTest is failed *****");
			captureScreen(driver, "viewEditReceiptTest");
			Assert.assertTrue(false);
		}
		
		logger.info("***** viewEditReceiptTest is completed *****");
		
}
	
}
