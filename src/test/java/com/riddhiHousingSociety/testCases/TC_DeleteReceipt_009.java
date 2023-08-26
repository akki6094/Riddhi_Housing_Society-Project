package com.riddhiHousingSociety.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.riddhiHousingSociety.pageObjects.DeleteReceiptPage;
import com.riddhiHousingSociety.pageObjects.LoginPage;

public class TC_DeleteReceipt_009 extends BaseClass {

	@Test
	public void deleteReceiptTest() throws InterruptedException, IOException
	{
		logger.info("Login Starts");
		LoginPage lp=new LoginPage(driver); //object of LoginPage
		lp.setUsername(USERNAME);
		lp.setPassword(PASSWORD);
		lp.clickSignIn();
		logger.info("Login Successfully");
		
		logger.info("***** deleteReceiptTest is start *****");
		DeleteReceiptPage deleterec = new DeleteReceiptPage(driver);
		deleterec.clickReceipts();
		deleterec.clickViewReceipts();
		deleterec.clickActionsLink();
		logger.info("***** click on delete link *****");
		deleterec.clickDelete();
		logger.info("***** Handle the Alert popup *****");
		driver.switchTo().alert().accept();
		
		logger.info("***** deleteReceiptTest is end *****");
		///html/body/main/div/div/div/div/div[1]/text()
		
		logger.info("***** verify the reciepts is deleted sussessfully or not *****");
		boolean success = driver.findElement(By.xpath("///html/body/main/div/div/div/div/div[1]/text()")).isDisplayed();
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
		
	}
}
