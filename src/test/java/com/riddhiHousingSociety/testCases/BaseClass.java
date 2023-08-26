package com.riddhiHousingSociety.testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.riddhiHousingSociety.utilities.ReadConfig;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();
	public String URL=readconfig.getApplicationURL();
	public String USERNAME=readconfig.getUsername();
	public String PASSWORD=readconfig.getPassword();
	public static WebDriver driver;

	public static Logger logger;

	@Parameters("browser")
	
	@BeforeMethod
	public void setup(String brow)

	{
		logger = Logger.getLogger("HousingSociety");
		PropertyConfigurator.configure("log4j.properties");


		if(brow.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver= new ChromeDriver(options);
		}
		else if(brow.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxpath());
			driver= new FirefoxDriver();
		}
		driver.get(URL);
		logger.info("URL is open");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}


	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

	// method to take the screenshot of failed test case
	public void captureScreen(WebDriver driver, String testname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") +"/Screenshots/" + testname +".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot is taken successfully");
	}

	// method to create random String
	public String randomstring() {
		String generatedstring = RandomStringUtils.randomAlphabetic(6);
		return (generatedstring);
	}

	// method to create random number
	public String randomNumber() {
		String generatedstring2 = RandomStringUtils.randomNumeric(4);
		return (generatedstring2);
	}

	// method to handle Vertical Scrollbar.
	public void handleScrollbarVerical() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0, document.body.scrollHeight)","");
		Thread.sleep(3000);
		js.executeScript("scroll(3000, 0)","");
	}
	
	//// method to handle Horizontal Scrollbar.
	public void handleScrollHorizontal()
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;     
		jse.executeScript("document.querySelector('table th:last-child').scrollIntoView();");
	}
}

