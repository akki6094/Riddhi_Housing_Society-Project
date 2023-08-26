package com.riddhiHousingSociety.testCases;

import org.testng.annotations.Test;
import java.io.IOException;

import com.riddhiHousingSociety.pageObjects.AddUserPage;
import com.riddhiHousingSociety.pageObjects.LoginPage;

public class TC_AddUserTest_010 extends BaseClass {

	

	@Test
	public void addUserTest() throws InterruptedException, IOException
	{
		logger.info("Login Starts");
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(USERNAME);
		lp.setPassword(PASSWORD);
		lp.clickSignIn();
		Thread.sleep(3000);
		logger.info("Login Successfully");
		
		logger.info("addUserTest test start");
		AddUserPage adduser = new AddUserPage(driver);
		adduser.clickUser();
		adduser.clickAddUser();
//		adduser.clickRollDrpdwn();
		adduser.setFullName("Rajesh Khanna");
		adduser.setMobileNumber("9876543212");
		adduser.setPassword("akhg@134");
		adduser.setAlternetNumber("9765432123");
		
		//Random email id created
		logger.info("create random email id");
		String Email = randomstring()+"@gmail.com";
		adduser.setEmail(Email);
		Thread.sleep(3000);
		adduser.setAddress("pune");
		Thread.sleep(3000);
		handleScrollbarVerical();
		
//		adduser.setGenderDrpdwn();
		Thread.sleep(3000);
		//Random Adhar number created
		logger.info("create random Adhar number");
		String Adhar = randomNumber()+"765476";
		adduser.setAdharNumber(Adhar);
		Thread.sleep(3000);
		
		//Random Pan number created
		logger.info("create random Pan number");
		String Pan = "COPFH"+randomNumber()+"E";
		adduser.setPanNumber(Pan);
		Thread.sleep(3000);
		adduser.clickSubmitBtn();
		
		logger.info("addUserTest End");
		
		
	}
}
