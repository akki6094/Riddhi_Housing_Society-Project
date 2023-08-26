package com.riddhiHousingSociety.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.riddhiHousingSociety.pageObjects.LoginPage;
import com.riddhiHousingSociety.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass {

	@Test(dataProvider="LoginData")
	public void loginDDT(String user, String Pwd) throws IOException 
	{
		logger.info("Login Start");
      LoginPage lp = new LoginPage(driver);
      lp.setUsername(user);
      lp.setPassword(Pwd);
      lp.clickSignIn();
      
      if(driver.getTitle().equals("Enquiries"))
      {
    	  logger.info("Login test pass");
    	  Assert.assertTrue(true);
    	  
    	  lp.clictAdminLink();
    	  lp.clickLogoutLink();
    	  logger.info("Logout successfully");
    	  driver.switchTo().defaultContent();
      }
      else
      {
    	  logger.info("Login test failed");
    	  captureScreen(driver, "loginDDT");
    	  Assert.assertTrue(false);
    	  driver.switchTo().defaultContent();
      }
      
	}

	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException
	{
		String path = System.getProperty("user.dir") +"/src/test/java/com/riddhiHousingSociety/testData/LoginData.xlsx";

		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);

		String logindata[][] = new String[rownum][colcount];

		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++) 
			{
				logindata[i-1][j] = XLUtils.getCellData(path, "Sheet1", i, j);//1 0
			}
		}
		return logindata;
	}

}
