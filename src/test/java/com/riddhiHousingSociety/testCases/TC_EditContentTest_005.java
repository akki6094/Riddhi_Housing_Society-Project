package com.riddhiHousingSociety.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.riddhiHousingSociety.pageObjects.EditContentPage;
import com.riddhiHousingSociety.pageObjects.LoginPage;

public class TC_EditContentTest_005 extends BaseClass {

	
	@Test
	public void editContentTest() throws InterruptedException, IOException
	{
		logger.info("Login Starts");
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(USERNAME);
		lp.setPassword(PASSWORD);
		lp.clickSignIn();
		logger.info("Login Successfully");
		
		logger.info("***** editContentTest is start *****");
		EditContentPage editcont = new EditContentPage(driver);
		editcont.clickContents();
		editcont.clickViewContents();
		editcont.ShowEntriesDrodwn();//click and select value from show entries dropdown
		
		// Perform Scrolling action
		logger.info("***** Scroll down the page *****");
		handleScrollbarVerical();
		Thread.sleep(3000);
		
		logger.info("***** Serach the content name *****");
		editcont.searchText("Automation");// Search content name in the search text box
		editcont.clickActions();
		editcont.clickEdit();// control goes to edit content page
		
		// Start to edit the content
		logger.info("***** Start to fill all the field with proper data *****");
		Thread.sleep(3000);
		editcont.clickSelectSectionDropdown();
		editcont.setContentTitle("Akshay");
		editcont.setContentCharges("3000");
		editcont.setContentSequence("AB");
		editcont.setContentImgAltTag("tag");
		editcont.setContentDescription("Automation Script");
		editcont.setDate("22", "08", "2023");
		editcont.setLocation("Solapur");
		editcont.setAddLink("https://tronsoftech.in/projects/riddhi/edit-content.php?contentid=27");
		editcont.setImage("C://Sign//ISTQB.jpg");
		editcont.clickSubmit();
		
		
		logger.info("***** End of the editContentTest *****");
		
	}
}
