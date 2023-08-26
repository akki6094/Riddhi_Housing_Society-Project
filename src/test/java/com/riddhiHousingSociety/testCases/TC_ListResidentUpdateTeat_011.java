package com.riddhiHousingSociety.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.riddhiHousingSociety.pageObjects.ListResidentPage;
import com.riddhiHousingSociety.pageObjects.LoginPage;

public class TC_ListResidentUpdateTeat_011 extends BaseClass {

	
	@Test
	public void listResidentUpdateTest() throws InterruptedException, IOException
	{
		logger.info("Login Starts");
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(USERNAME);
		lp.setPassword(PASSWORD);
		lp.clickSignIn();
		logger.info("Login Successfully");

		logger.info("listResidentUpdateTest is start");
		
		ListResidentPage listresident = new ListResidentPage(driver);
		listresident.clickUsers();
		listresident.clickListResident();
		listresident.showEntriesDrpdwn();
		Thread.sleep(3000);
		handleScrollbarVerical();
		Thread.sleep(3000);
		
		//		listresident.showEntriesDrpdwn();
//		listresident.setSerach("Jayanta");
//		Thread.sleep(3000);
//		listresident.clickView();
//		logger.info("click view");
//		Thread.sleep(3000);
//		listresident.clickUpdateProfile();
//		Thread.sleep(3000);
//		listresident.setWingDrpdwn();
//		listresident.setHouseNumber("12");

//		//Take data from Add user page
//		AddUserPage adduser = new AddUserPage(driver);
//		adduser.setFullName("Akshay");
//		adduser.setMobileNumber("9876567890");
//		adduser.setPassword("dasd21234");
//		adduser.setAlternetNumber("9876543345");
//		//Random email id created
//		logger.info("create random email id");
//		String Email = randomstring()+"@gmail.com";
//		adduser.setEmail(Email);
//		
//		adduser.setAddress("pune");
//		adduser.setGenderDrpdwn();
//		
//		//Random Adhar number created
//		logger.info("create random Adhar number");
//		String Adhar = randomNumber();
//		adduser.setAdharNumber(Adhar);
//		
//		//Random Pan number created
//		logger.info("create random Pan number");
//		String Pan = randomNumber();
//		adduser.setPanNumber(Pan);
//		
//		listresident.clickSaveBtn();
		
		
		logger.info("listResidentUpdateTest End");



	}
}
