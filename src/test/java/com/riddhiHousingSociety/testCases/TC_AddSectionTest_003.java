package com.riddhiHousingSociety.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.riddhiHousingSociety.pageObjects.AddSectionPage;
import com.riddhiHousingSociety.pageObjects.LoginPage;

public class TC_AddSectionTest_003 extends BaseClass {


	@Test
	public void addSectionTest() throws InterruptedException, IOException
	{
		logger.info("Login Starts");
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(USERNAME);
		lp.setPassword(PASSWORD);
		lp.clickSignIn();
		
		logger.info("Login Completed");
		Thread.sleep(3000);

		logger.info("Adding new Section start");
		AddSectionPage addsec= new AddSectionPage(driver);
		addsec.clickSection();

		String sectionname=randomstring();
		addsec.addSection(sectionname);
		addsec.clickSubmit();
		logger.info("Section added successfully");
//		boolean result = driver.getPageSource().contains("Success!Section added Successfully...");
		boolean result1 = driver.findElement(By.xpath("//div[@class='alert alert-success']")).isDisplayed();
		if(result1==true)
		{
			logger.info("success msg is display ");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("success msg is not display ");
			captureScreen(driver, "addSectionTest");
			Assert.assertTrue(false);
		}

		logger.info("click on dropdown and select the value");
		addsec.clickEntries();
		Thread.sleep(4000);
		addsec.select_dropdown();
		Thread.sleep(5000);
		handleScrollbarVerical();
		

		logger.info("search added section");
		addsec.searchSection(sectionname);
		Thread.sleep(4000);
		boolean result2 = driver.findElement(By.xpath("//*[@id=\"sampleTable\"]/tbody/tr[1]/td[2]")).isDisplayed();

			if(result2==true)
			{
				logger.info("search element display");
				Assert.assertTrue(true);
			}
			else
			{
				logger.info("search element not display");
				captureScreen(driver, "addSectionTest");
				Assert.assertTrue(false);
			}


	}
}

