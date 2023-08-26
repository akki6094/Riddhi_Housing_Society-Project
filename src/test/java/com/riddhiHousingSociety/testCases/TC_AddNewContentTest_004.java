package com.riddhiHousingSociety.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.riddhiHousingSociety.pageObjects.AddContentPage;
import com.riddhiHousingSociety.pageObjects.LoginPage;

public class TC_AddNewContentTest_004 extends BaseClass {


	@Test
	public void addNewContentTest() throws InterruptedException, IOException
	{
		logger.info("Login Starts");
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(USERNAME);
		lp.setPassword(PASSWORD);
		lp.clickSignIn();
		logger.info("Login Successfully");
		
		logger.info("***** addNewContentTest is start *****");
		AddContentPage addsec = new AddContentPage(driver);
		addsec.clickContents();
		addsec.clickAddNewContents();
		addsec.clickSelectSectionDropdown();
		addsec.setContentTitle("Automation tester");
		addsec.setContentCharges("3000");
		addsec.setContentSequence("A");
		addsec.setContentImgAltTag("manual");
		addsec.setContentDescription("Scode technology");
		addsec.setDate("21", "08", "2023");
		addsec.setLocation("Pune");
		addsec.setAddLink("https://tronsoftech.in/projects/riddhi/add-content.php");
		addsec.setImage("C://Sign//ISTQB.jpg");
		
		addsec.clickSubmit();
		Thread.sleep(3000);
		
		// Scrolling functionality
		handleScrollbarVerical();
		Thread.sleep(3000);
		
		boolean successAlert = driver.findElement(By.xpath("//div[@class='alert alert-success']")).isDisplayed();
		if(successAlert==true)
		{
			logger.info("addNewContentTest test is pass");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("addNewContentTest test is Failed");
			captureScreen(driver, "addNewContentTest");
			Assert.assertTrue(false);
		}
		logger.info("***** End of addNewContentTest test *****");
	}
}
