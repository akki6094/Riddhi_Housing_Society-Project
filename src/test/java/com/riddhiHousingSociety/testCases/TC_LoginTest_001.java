package com.riddhiHousingSociety.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.riddhiHousingSociety.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException, IOException
	{
		
		LoginPage lp= new LoginPage(driver);
		lp.setUsername(USERNAME);
		lp.setPassword(PASSWORD);
		
		lp.clickSignIn();
		Thread.sleep(5000);
		logger.info("Login to the application");
		
//		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Enquiries"))
		{
			Assert.assertTrue(true);
			logger.info("Test is pass");
			
		}
		else
		{
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Test is failed");
		}
	}
	
}
