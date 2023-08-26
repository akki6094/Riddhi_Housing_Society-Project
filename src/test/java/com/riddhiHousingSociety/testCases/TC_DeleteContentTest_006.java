package com.riddhiHousingSociety.testCases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.riddhiHousingSociety.pageObjects.DeleteContentPage;
import com.riddhiHousingSociety.pageObjects.LoginPage;

public class TC_DeleteContentTest_006 extends BaseClass {


	@Test
	public void deleteContentTest() throws InterruptedException, IOException
	{
		logger.info("Login Starts");
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(USERNAME);
		lp.setPassword(PASSWORD);
		lp.clickSignIn();
		logger.info("Login Successfully");
		
		logger.info("***** deleteContentTest is start *****");
		DeleteContentPage deletecont = new DeleteContentPage(driver);
		deletecont.clickContents();
		deletecont.clickViewContents();
		deletecont.searchText("megha patil");
		deletecont.clickActions();
		deletecont.clickDelete();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		logger.info("***** End of the deleteContentTest *****");
	
	}
}
