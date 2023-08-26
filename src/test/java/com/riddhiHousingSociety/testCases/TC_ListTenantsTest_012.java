package com.riddhiHousingSociety.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.riddhiHousingSociety.pageObjects.AddUserPage;
import com.riddhiHousingSociety.pageObjects.ListTenantsPage;
import com.riddhiHousingSociety.pageObjects.LoginPage;

public class TC_ListTenantsTest_012 extends BaseClass {

	@Test
	public void listTenantsTest() throws InterruptedException, IOException
	{
		logger.info("Login Starts");
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(USERNAME);
		lp.setPassword(PASSWORD);
		lp.clickSignIn();
		logger.info("Login Successfully");
		
		
		ListTenantsPage tenants = new ListTenantsPage(driver);
		tenants.clickUsers();
		tenants.clickListTenants();
		tenants.clickView();
		Thread.sleep(3000);
		tenants.clickUpdateProfile();
		Thread.sleep(3000);
		
		
		AddUserPage adduser=new AddUserPage(driver);
		
		adduser.setFullName("Rajesh Khanna");
		adduser.setMobileNumber("9876543212");
		adduser.setPassword("akhg@134");
		adduser.setAlternetNumber("9765432123");
		
		//Random email id created
		logger.info("create random email id");
		String Email = randomstring()+"@gmail.com";
		adduser.setEmail(Email);
		adduser.setAddress("pune");
		Thread.sleep(3000);
		handleScrollbarVerical();
		
//		adduser.setGenderDrpdwn();
		Thread.sleep(3000);
		//Random Adhar number created
		logger.info("create random Adhar number");
		String Adhar = randomNumber()+"10000012";
		tenants.setAdharNumber(Adhar);
		Thread.sleep(3000);
		
		//Random Pan number created
		logger.info("create random Pan number");
		String Pan = "COPFW"+randomNumber()+"E";
		tenants.setPanNumber(Pan);
		Thread.sleep(3000);
		tenants.clickSave();
		
		boolean success = driver.findElement(By.xpath("//div[@class='alert alert-success']")).isDisplayed();
		if(success==true)
		{
			logger.info("***** listTenantsTest is pass *****");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("***** listTenantsTest is failed *****");
			captureScreen(driver, "listTenantsTest");
			Assert.assertTrue(false);
		}
		
		
		logger.info("listTenantsTest End");
	}	
}
